FROM anapsix/alpine-java:jre8

WORKDIR /data

EXPOSE 10001

ENV SERVICE_REGISTRY_URL http://localhost:8761/eureka/

ADD build/libs/*.jar /data/service.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","service.jar"]
