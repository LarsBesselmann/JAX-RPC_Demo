#Start tWAs ND Environment

echo ""

echo "Stopping  Node AppSrv01"
~/IBM/WebSphere/AppServer/profiles/AppSrv01/bin/stopNode.sh -profileName AppSrv01 
echo ""


echo "Stopping  Node AppSrv02"
~/IBM/WebSphere/AppServer/profiles/AppSrv02/bin/stopNode.sh -profileName AppSrv02

echo "" 

echo "Stopping  Dmgr"
~/IBM/WebSphere/AppServer/profiles/Dmgr01/bin/stopManager.sh

echo ""
echo " Script completed" 