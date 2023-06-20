FROM openjdk:17
MAINTAINER Denis Krasnov
LABEL APPLICATION=Counter

COPY target/counter-0.0.4-SNAPSHOT.jar /usr/app/counter-0.0.4-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/usr/app/counter-0.0.4-SNAPSHOT.jar"]