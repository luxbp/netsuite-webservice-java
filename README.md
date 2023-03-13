# NetSuite Webservice

Recommended JVM: [Azul Zulu: Java 17 LTS](https://www.azul.com/downloads/?version=java-17-lts&package=jdk)

This repository is for building the WSDL Dependency for interacting with Netsuite's SOAP Service.


## Deployments
This package is automatically deployed to Github packages when a release tag is created using a workflow located in [.github/workflows/maven-deploy.yml](./.github/workflows/maven-deploy.yml)

## Build
- Run `mvn clean` first if updating.
- Run `mvn install` to generate NetSuite SOAP web services.

## Package as Dependency (Local)
- Run `mvn package`, outputs to: `./target/webservices-<VERSION>.jar`

## Running tests
`mvn test`

## Changing WSDL Version
Update the WSDL URL in `build.xml`
```xml
  <axis-wsdl2java
    all="true"
    wraparrays="true"
    output="${basedir}/src/main/java"
    verbose="true"
    timeout="120000"
    url="https://webservices.netsuite.com/wsdl/v2022_1_0/netsuite.wsdl"/>
```

## Troubleshooting
If regenerating/changing WSDL version it may be necessary to delete the directory contents of `./src/main/java/com.netsuite.webservices`