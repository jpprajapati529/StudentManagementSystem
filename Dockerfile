FROM eclipse-temurin:8u452-b09-jre-ubi9-minimal
WORKDIR /app
COPY target/sms-0.0.1-SNAPSHOT.jar /app/sms-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD [ "java", "-jar", "sms-0.0.1-SNAPSHOT.jar" ]
