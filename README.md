# NetSuite Webservice

This repository is for building the WSDL Dependency for interacting with Netsuite's SOAP Service.

## Build
- Run `mvn clean` first if updating.
- Run `mvn install` to generate NetSuite SOAP web services.

## Package as Dependency
- Run `mvn package`, outputs to: `./target/webservices-<VERSION>.jar`

## Troubleshooting
If regenerating it may be necessary to delete the directory contents of `./src/main/java/com.netsuite.webservices`