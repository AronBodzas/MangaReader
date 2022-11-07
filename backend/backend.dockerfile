FROM alpine
MAINTAINER aron
COPY target/backend-1.0-SNAPSHOT.jar backend.jar
CMD ["java", "-jar", "backend.jar"]

EXPOSE 8080