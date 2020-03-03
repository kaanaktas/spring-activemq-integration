# spring-activemq-integration

Demostrates a basic integration for ActiveMQ Artemis by using Spring Boot. Uses embedded ActiveMQ and to use external broker, delete below dependencies from pom.xml and add default user credental to the application.properties file.

#application.properties
spring.artemis.user=artemis
spring.artemis.password=simetraehcapa

#pom.xml
<dependency>
    <groupId>org.apache.activemq</groupId>
    <artifactId>artemis-server</artifactId>
</dependency>
<dependency>
    <groupId>org.apache.activemq</groupId>
    <artifactId>artemis-jms-server</artifactId>
</dependency>
