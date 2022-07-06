FROM openjdk:11
ADD target/spring-boot-docker-exam-0.0.1-SNAPSHOT.jar spring-boot-docker-exam-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-boot-docker-exam-0.0.1-SNAPSHOT.jar"] 