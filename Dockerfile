FROM java:openjdk-8

EXPOSE 8080

ADD target/spring-boot-docker-image-0.0.1-SNAPSHOT.jar spring-boot-docker-image-0.0.1-SNAPSHOT.jar

ENTRYPOINT   ["java","-jar","/spring-boot-docker-image-0.0.1-SNAPSHOT.jar"]