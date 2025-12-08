#!/bin/bash
current=$(pwd)
# Loop through each child directory
for dir in "$current"/*/; do
    # Navigate to the child directory
    if [[ $dir == */target/ || ${dir%/} == */FlightTrackerMM || ${dir%/} == */EmptyDir || ${dir%/} == */HelloWSClient || ${dir%/} == */HelloRPCEJBClientLib ]]; then
        continue
    fi
    cd "$dir" || exit

    # Copy the pom.xml file from the parent directory
    cp "../original_pom.xml" ./pom.xml
	
	# Use the current working dir to assign the artifactID in the pom.xml
	projectName=${PWD##*/} 
	sed -i '' "s~ARTIFACT_ID_PLACEHOLDER~${projectName}~g" pom.xml

	    wsdl_paths=$(find . -type f -name "*.wsdl" ! -path "*/target/*.wsdl")
      for wsdl_path in $wsdl_paths; do
          resource_path=${wsdl_path/#.\//}
          resource_path="${resource_path%%/WEB-INF*}"
          resource_path="${resource_path%%/META-INF*}"
          echo "$resource_path"
          sed -i '' "s~RESOURCE_DIR_PLACEHOLDER~${resource_path}~g" pom.xml
          break
      done

done

echo "Script completed successfully."