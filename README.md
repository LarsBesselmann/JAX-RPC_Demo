# How to demo AMA tools for JAX-RPC

The following guide should help to do a simple end-to-end tutorial.
Main steps:
1. Test the JAX-RPC client calling the JAX-RPC service both running as separate applications in traditional WAS.
2. Analyze the applications using Application Modernization Accelerator (AMA) to identify issues when migrating to Liberty
3. Use the Application Modernization Accelerator Development Tools to convert the tWAS JAX-RPC service to JAX-WS on Liberty
4. Test the modernized JAX-WS service running on Liberty with the existing JAX-RPC client running on Liberty.
5. Optional: Use the Application Modernization Accelerator Development Tools to convert the JAX-RPC client to JAX-WS on Liberty
6. Test the modernized JAX-WS service with the modernized JAX-WS client both running on separate Liberty instances.

It is based on the TechZone environment:
https://techzone.ibm.com/my/reservations/create/6920edc50768fd50bcad6e74 


## Introduction

WebSphere Application Server Liberty does not support JAX-RPC services or clients. However, the Liberty JAX-RPC conversion tool can convert JAX-RPC applications to JAX-WS applications that can run on Liberty. 
https://www.ibm.com/support/pages/websphere-liberty-jax-rpc-conversion-tool-maven-and-gradle 
Unfortunately the tool could only act on the application binaries. A new functionality within **Application Modernization Accelerator Development Tools** now allows to automate the conversion in the source code. The tutorial will show how to do it

In this tutorial, you will use an existing JAX-RPC application running on traditional WebSphere Application Server. The applicaton consists of a client and a service component, both installed on different WAS servers within the same WAS ND cell. 
First you will test the application as is, then you will analyze it for mdernizatrion target Liberty using the Application Modernization Accelerator (AMA).  Then you will use the AMA Dev Tool automation to modernize the service from JAX-RPC to JAX-WS so that it can run on Liberty. 

## Preparation:

### Reserve an environment in Techzone
Please request the following RHEL environment in TechZone.
https://techzone.ibm.com/my/reservations/create/6920edc50768fd50bcad6e74
When the environment is provisioned and ready, open the TZ env reservation tile, and select the noVNC published service link in the reservation details page. 
The NoZNC password is: IBMDem0s!

Comment:
The environment has the following software installed:

- Application Modernization Accelerator 4.5 
- Application Modernization Accelerator Development Tools 4.5
- WAS ND 9.0.5 cell with Deployment Manager and two standalone servers server1 and server2
- The JAX-RPC application deployed on server1


### Clone the project

1. Open a Terminal window.

2. Create a working directory and download the project

		mkdir -p ~/Student
		git clone https://github.com/LarsBesselmann/JAX-RPC_Demo ~/Student
		cd  /home/techzone/Student/demo-rpc-ws-project
		chmod 777 /home/techzone/Student/demo-rpc-ws-project/scripts/*.sh



### Prepare the environment

1. Start the WAS ND Deployment Manager and the two node agents
	
		~/Student/demo-rpc-ws-project/scripts/startWASEnv.sh

	Alternatively you could also start the components separately

		~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/startManager.sh
		~/IBM/WebSphere/AppServer/profiles/AppSrv01/bin/startNode.sh 
		~/IBM/WebSphere/AppServer/profiles/AppSrv02/bin/startNode.sh 


2. Adjust the JAX-RPC service deployment (map it to server1)

		~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/wsadmin.sh -lang jython -f ~/Student/demo-rpc-ws-project/scripts/adjust_JAXRPC_service_deployment.py

3. Adjust the JAX-RPC client deployment (map it to server2 and change the context root from "/" to "/DemoRPCClient")

		~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/wsadmin.sh -lang jython -f ~/Student/demo-rpc-ws-project/scripts/adjust_JAXRPC_client_deployment.py


4. Access the Deployment Manager Administration Console via the URL https://localhost:9043/ibm/console to review the environment. 

- Credentials: techzone / IBMDem0s!
- server1 listens on HTTP port 9080
- server2 listens on HTTP port 9082

<br>

### Prepare the application assessment

#### Start the Application Modernization Accelerator 
To start the Application Modernization Accelerator, run the following commands

	cd ~/application-modernization-accelerator-local-4.5.0/
	./launch.sh 5

You should get an output like: <br>
**The Application Modernization Accelerator 4.5.0 is available for use at the following URL> https://rhel9-base.gym.lan:3001**

Access AMA via browser using the URL https://rhel9-base.gym.lan:3001.

<kbd>![](./images/media/AMA_Panel1.png)</kbd>


#### Create a workspace, then download and run the discovery tool

1. In AMA, create a new workspace called **JAX_RPC**.

	<kbd>![](./images/media/AMA_Create_Workspace.png)</kbd>

2. Download the discovery tool.

	Click on **Open discovery tool** 
	
	<kbd>![](./images/media/AMA_OpenDiscoveryTool.png)</kbd>

	Leave the Source Operating System as Linux and click on **Download discovery tool** to download the discovery tool.

	<kbd>![](./images/media/AMA_DownloadDiscoveryTool.png)</kbd>

	The file will be stored under  **~Downloads**

3. Extract the AMA Discovery Tool

	In a terminal window, execute the following commands:

		mkdir ~/Student/ama_discovery
		cd ~/Student/ama_discovery/
		tar -zxvf ~/Downloads/DiscoveryTool-Linux_JAX_RPC.tgz 

4. Run the discovery tool: 

		cd ama-discovery-4.5.0
		bin/ama-discovery -w ~/IBM/WebSphere/AppServer/


	Wait until you see a message indicating that the discovery has completed and the collection has been uploaded.
	<kbd>![](./images/media/AMA_Discovery_Completed.png)</kbd>


5. Switch back to theh browser with the AMA (https://rhel9-base.gym.lan:3001). You should see a panel like this:

	<kbd>![](./images/media/AMA_Manage_Destination.png)</kbd>

	Select the **radio button** next to Liberty and click **Confirm**
	<kbd>![](./images/media/AMA_Manage_Destination2.png)</kbd>


6. In the Visualzation Panel, you can see the three discovered applications. 
	<kbd>![](./images/media/AMA_Visualization_Panel.png)</kbd>

Leave the browser open as you will use it later in the demo.


<br>

## Start the demo

### Test the JAX-RPC application on traditional WAS

1. Start the tWAS servers server1 and server2

		~/IBM/WebSphere/AppServer/profiles/AppSrv01/bin/startServer.sh server1
		~/IBM/WebSphere/AppServer/profiles/AppSrv02/bin/startServer.sh server2

2. Access the JAX-RPC service via server1 at URL: http://localhost:9080/DemoRPC/services/DemoRPC

	<kbd>![](./images/media/JAX-RPC_service_server1.png)</kbd>


2. Access the JAX-RPC client via server1 at URL: http://localhost:9082/DemoRPCClient

	<kbd>![](./images/media/JAX-RPC_client_server2_A.png)</kbd>

3. Click on the link to access the servlet page **Personal Info Web Service**

	<kbd>![](./images/media/JAX-RPC_client_server2_B.png)</kbd>

4. Enter Jane Doe for the name, then click on **Submit Query** 

	<kbd>![](./images/media/JAX-RPC_client_server2_C.png)</kbd>

	You should get the age and place of birth as response from the JAX-RPC service. 

	<kbd>![](./images/media/JAX-RPC_client_server2_D.png)</kbd>


### Assess the application

1. Access the Application Modernization Accelerator via browser using the URL https://rhel9-base.gym.lan:3001.













