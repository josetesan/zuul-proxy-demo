FROM anapsix/alpine-java:jre8

WORKDIR /data

EXPOSE 8761

ADD build/libs/*.jar /data/service.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","service.jar"]