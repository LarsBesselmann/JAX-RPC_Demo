# Map the DemoRPCClient-1_0_0_war client application to server2
AdminApp.edit('DemoRPCClient-1_0_0_war', '[ -MapModulesToServers [[ DemoRPCClient-1.0.0.war DemoRPCClient-1.0.0.war,WEB-INF/web.xml WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode01,server=webserver1+WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode02,server=server2 ]]]' )

# Adjust the DemoRPCClient-1_0_0_war context root to "/DemoRPCClient"
AdminApp.edit('DemoRPCClient-1_0_0_war', '[ -CtxRootForWebMod [[ DemoRPCClient-1.0.0.war DemoRPCClient-1.0.0.war,WEB-INF/web.xml /DemoRPCClient ]]]' )
 
# Optional: Map the DemoRPCClient-1_0_0_war to server2 and the web server
# AdminApp.edit('DemoRPCClient-1_0_0_war', '[ -MapModulesToServers [[ DemoRPCClient-1.0.0.war DemoRPCClient-1.0.0.war,WEB-INF/web.xml WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode01,server=webserver1+WebSphere:cell=rhel9-baseCell01,node=rhel9-baseNode02,server=server2 ]]]' )
