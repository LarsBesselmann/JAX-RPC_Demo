#!/bin/bash
current=$(pwd)
# Loop through each child directory
for dir in "$current"/*/; do
    # Navigate to the child directory
    if [[ $dir == */target/ ]]
    then 
        continue
    fi
    cd "$dir" || exit

    # Copy the pom.xml file from the parent directory
    cp "../migration_pom.xml" ./pom.xml
    cp "../rewrite.yml" ./rewrite.yml
    mkdir -p liberty/config
    cp ../server.xml liberty/config/server.xml
	
	# Use the current working dir to assign the artifactID in the pom.xml
	projectName=${PWD##*/} 
	sed -i '' "s~ARTIFACT_ID_PLACEHOLDER~${projectName}~g" pom.xml

    wsdl_paths=$(find . -name "*.wsdl")
    for wsdl_path in $wsdl_paths; do
        wsdl_path_relative=${wsdl_path/#.\//}
        sed -i '' "s~WSDL_PATH_PLACEHOLDER~${wsdl_path_relative}~g" rewrite.yml
    done
done

echo "Script completed successfully."