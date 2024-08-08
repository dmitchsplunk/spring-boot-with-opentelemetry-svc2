# spring-boot-with-opentelemetry

Build the application with: 

````
mvn package
````

Then run the app with: 

````
export OTEL_SERVICE_NAME=svc2
export OTEL_RESOURCE_ATTRIBUTES='deployment.environment=spring-boot-test'
java -javaagent:./splunk-otel-javaagent.jar -Dserver.port=8090 -jar ./target/myproject-0.0.1-SNAPSHOT.jar
````

Test it with: 

````
curl http://localhost:8090
````