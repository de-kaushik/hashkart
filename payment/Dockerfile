FROM openjdk:8
ADD target/paymentService-0.0.1-SNAPSHOT.jar.jar payment-service-docker.jar
ENTRYPOINT ["java", "-jar", "payment-service-docker.jar"]