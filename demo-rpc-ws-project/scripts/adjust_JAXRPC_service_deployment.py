# Map the DemoRPC-1_0_0_war service application to server1
AdminApp.edit('DemoRPC-1_0_0_war', '[ -MapModulesToServers [[ "Demo RPC Web Service" DemoRPC-1.0.0.war,WEB-INF/web.xml WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode01,server=server1+WebSphere:cell=rhel9-baseCell01]]]' )

# Optional: Map the DemoRPC-1_0_0_war to server1 and the web server
# AdminApp.edit('DemoRPC-1_0_0_war', '[ -MapModulesToServers [[ "Demo RPC Web Service" DemoRPC-1.0.0.war,WEB-INF/web.xml WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode01,server=server1+WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode01,server=webserver1 ]]]' )
 
