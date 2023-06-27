FROM openjdk:17-alpine
WORKDIR /app
COPY target/uts-0.0.1-SNAPSHOT.jar uts.jar
EXPOSE 5002
CMD ["java", "-jar", "uts.jar"]
