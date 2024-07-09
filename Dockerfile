FROM openjdk:17

COPY target/spring-boot-mysql-docker.jar spring-boot-mysql-docker.jar

ENTRYPOINT ["java", "-jar", "/spring-boot-mysql-docker.jar"]
