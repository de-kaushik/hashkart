FROM openjdk:8
ADD target/ServiceRegistry-0.0.1-SNAPSHOT.jar serviceRegistry-service-docker.jar
ENTRYPOINT ["java", "-jar", "serviceRegistry-service-docker.jar"]