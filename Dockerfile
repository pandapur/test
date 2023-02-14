FROM openjdk:17-alpine
MAINTAINER pandapur
COPY build/libs/demo-0.0.1-SNAPSHOT.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar"]
