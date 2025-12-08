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


### Clone the project

1. Open a Terminal window.

2. Create a working directory and download the project

		mkdir -p ~/Student
		git clone https://github.com/LarsBesselmann/JAX-RPC_Demo ~/Student
		cd  /home/techzone/Student/demo-rpc-ws-project
		chmod 777 /home/techzone/Student/demo-rpc-ws-project/scripts/*.sh


### Prepare the environment

1. Start the tWAS environment

		~/Student/demo-rpc-ws-project/scripts/startWASEnv.sh

2. Adjust the JAX-RPC service deployment (map it to server1)

		~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/wsadmin.sh -lang jython -f ~/Student/demo-rpc-ws-project/scripts/adjust_JAXRPC_service_deployment.py

3. Adjust the JAX-RPC client deployment (map it to server2 and change the context root from "/" to "/DemoRPCClient")

		~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/wsadmin.sh -lang jython -f ~/Student/demo-rpc-ws-project/scripts/adjust_JAXRPC_client_deployment.py

### Test the JAX-RPC application on traditional WAS




