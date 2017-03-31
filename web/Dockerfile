FROM java:8

ADD ./build/libs/web-0.0.1-SNAPSHOT.jar web-0.0.1-SNAPSHOT.jar

EXPOSE 8080
EXPOSE 8090

ENTRYPOINT ["java", "-jar", "./web-0.0.1-SNAPSHOT.jar"]
