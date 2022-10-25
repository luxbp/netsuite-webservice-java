# NetSuite Webservice

Recommended JVM: [Azul Zulu: Java 8 LTS](https://www.azul.com/downloads/?version=java-8-lts&package=jdk)

This repository is for building the WSDL Dependency for interacting with Netsuite's SOAP Service.


## Install from Github Packages
- Setup a `~/.m2/settings.xml` profile with Github credentials.
  - https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry

- Add maven dependency
```xml
<dependency>
  <groupId>com.netsuite</groupId>
  <artifactId>webservices</artifactId>
  <version>2022.1</version>
</dependency>
```

- Run `mvn install`

## Deployments
This package is automatically deployed to Github packages when a release tag is created using a workflow located in [.github/workflows/maven-deploy.yml](./.github/workflows/maven-deploy.yml)

## Configuration
Copy `.env.example` to `.env` in the root directly and fill out credentials.

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

Update the version number in `.env`.
```shell
NETSUITE_VERSION="2022_1"
```

## Troubleshooting
If regenerating/changing WSDL version it may be necessary to delete the directory contents of `./src/main/java/com.netsuite.webservices`