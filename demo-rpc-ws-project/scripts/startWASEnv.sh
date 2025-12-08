#Start tWAs ND Environment

echo ""
echo "Starting  Dmgr"
~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/startManager.sh

echo ""

echo "Starting  Node AppSrv01"
~/IBM/WebSphere/AppServer/profiles/AppSrv01/bin/startNode.sh 
echo ""


echo "Starting  Node AppSrv02"
~/IBM/WebSphere/AppServer/profiles/AppSrv02/bin/startNode.sh 

echo "" 
echo "Script comepleted"