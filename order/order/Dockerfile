FROM openjdk:8
ADD target/order-0.0.1-SNAPSHOT.jar order-service-docker.jar
ENTRYPOINT ["java", "-jar", "order-service-docker.jar"]