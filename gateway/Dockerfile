FROM openjdk:8
ADD target/CloudGateway-0.0.1-SNAPSHOT.jar cloudGateway-service-docker.jar
ENTRYPOINT ["java", "-jar", "cloudGateway-service-docker.jar"]