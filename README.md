# spring-activemq-integration

Demostrates a basic integration for ActiveMQ Artemis by using Spring Boot. To use embedded ActiveMQ instead of external broker, add below dependencies to pom.xml.

# Run ActiveMQ on Docker 
docker run -it --rm -p 8161:8161 -p 61616:61616 vromero/activemq-artemis

# application.properties
spring.artemis.user=artemis  
spring.artemis.password=simetraehcapa

# pom.xml
```xml
<dependency>
    <groupId>org.apache.activemq</groupId>
    <artifactId>artemis-server</artifactId>
</dependency>
<dependency>
    <groupId>org.apache.activemq</groupId>
    <artifactId>artemis-jms-server</artifactId>
</dependency>
```
