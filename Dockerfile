FROM openjdk:17
MAINTAINER Denis Krasnov
LABEL APPLICATION=Counter
FROM maven:3.6-openjdk-17 AS build

COPY target/counter-0.0.1-SNAPSHOT.jar /usr/app/counter-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/app/counter-0.0.1-SNAPSHOT.jar"]