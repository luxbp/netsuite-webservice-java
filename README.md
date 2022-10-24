# NetSuite Webservice

This repository is for building the WSDL Dependency for interacting with Netsuite's SOAP Service.

## Configuration
Copy `.env.example` to `.env` in the root directly and fill out credentials.

## Build
- Run `mvn clean` first if updating.
- Run `mvn install` to generate NetSuite SOAP web services.

## Package as Dependency
- Run `mvn package`, outputs to: `./target/webservices-<VERSION>.jar`

## Running tests

`mvn test`

## Troubleshooting
If regenerating it may be necessary to delete the directory contents of `./src/main/java/com.netsuite.webservices`