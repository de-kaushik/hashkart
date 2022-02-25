FROM openjdk:8
ADD target/product-0.0.1-SNAPSHOT.jar product-service-docker.jar
ENTRYPOINT ["java", "-jar", "product-service-docker.jar"]