#!/bin/bash

while :
do
#  read INPUT_STRING
#  case $INPUT_STRING in
  case $1 in

	host)
		env | grep HOST
		break
		;;
	java)
		java -version
		break
		;;
	maven)
		mvn -version
		break
		;;
    git)
		git -v
		break
		;;
    docker)
		docker -v
		break
		;;
    vscode)
		code --version | grep "1.*.*" -m 1
		break
		;;
	wca1)
		wca_backend=VWRv10JHuPp-Ps5tN2YSaxSqcLTUTdeEgdofeuBL4WCA
		echo ${wca_backend/WCA/$2}
		break
		;;
	wca2)
		wca_backend=WbZa0pqP8mw-8h82lMUMFXqZ0P32oNP-1Mp89cXg1WCA
		echo ${wca_backend/WCA/$2}
		break
		;;
		
		
	*)
		echo "Sorry, I don't understand"
		break
		;;
  esac
done