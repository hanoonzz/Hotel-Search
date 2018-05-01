![alt text](https://travis-ci.org/hanoonzz/Hotel-Search.svg?branch=master)
# Hotel-Search 
Hotel-Search is a simple web applicaton to look up some hotel offers using an external API 
the project is built with JAVA, Spring Framework and Spring MVC 4

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development.

### Prerequisites

* JAVA (1.8)
* Maven 
* Tomcat Server (I'm using version 8.5)
* IDE (I'm using Spring STS)

### Installing
Deploy to Tomcat locally, the steps are for windows

#### Deploy to Tomcat folder
1. Download Apache Tomcat
check the steps for installing Tomcat from (https://tomcat.apache.org/tomcat-8.5-doc/deployer-howto.html)
1. Clone or Download the source
1. Copy the war file from (~Hotel-Search\HotelSearch\target) to (Tomcat-installtion-path\webapps)
1. Start Tomcat Server 
	1. go to (Tomcat-installtion-path\bin\)
	1. run the batch file startup
1. In your browser go to (localhost:8080/HotelSearch-0.0.1-SNAPSHOT/)


## Built With

* [Spring](https://spring.io) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management

### Assumptions
* User will always specify the destination correctly 


### Known Issues
In Flight Search the trip min start date doesn't always return correct results 
the filter for start date was removed 
