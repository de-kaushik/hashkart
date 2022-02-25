FROM openjdk:8
ADD target/user-0.0.1-SNAPSHOT.jar user-service-docker.jar
ENTRYPOINT ["java", "-jar", "user-service-docker.jar"]