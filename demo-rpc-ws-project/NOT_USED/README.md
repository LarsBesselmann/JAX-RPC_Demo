To setup a project to migrate, first add installing the openrewrite plugin pom by running 

`mvn install:install-file -Dfile=wamt-openrewrite-25.0.0.13-SNAPSHOT.jar

then run the `./setup.sh` script to generate the pom.xml files for each test project.

Then inside any project, run `mvn rewrite:run` to migrate the RPC application to WS.

Finally run `mvn liberty:run` to deploy it to Liberty.

To undo the RPC to WS migration for a specific project, run `git checkout . && git clean -fd` from inside that project's directory.