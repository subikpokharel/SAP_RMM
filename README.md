# SAP_RMM
Spring Boot Backend application 


Steps to deploy JAR file :

- Install Maven and ensure Maven is installed using Instructions given below and check maven is installed or not using mvn --version.

1. Make sure that you do Maven clean install - mvn clean install
2. Go to your project root directory , you will get JAR Snapshoot file in Target folder of the project.
3. Deploy JAR file using command "java -jar sap-0.0.1-SNAPSHOT.jar " .
4. Open PostmanClient and do GET Request using http://localhost:8081/sap/rmmValue you can see the data being fetched.

Steps to deploy WAR file using WebLogic:

1. Change the packaging from JAR to WAR file.
2.Similarly, make sure you do maven clean install - mvn clean install
3. Go to you project root directory , you will get WAR Snapshoot file in Target folder of the project.
4. There are 2 ways of deploying application on WebLogic Server 
a. Copy WAR file - sap-0.0.1-SNAPSHOT.war to folder of the server and then deploy it to WebLogic
5. Else, Use Upload Function to deploy WAR File.

Links for MAVEN and WebLogic:
A.Steps to Install and Deploy Application using Web Logic:

https://o7planning.org/en/11901/deploying-spring-boot-application-on-oracle-weblogic-server

B. Steps to Install Maven :
https://maven.apache.org/install.html

https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html
