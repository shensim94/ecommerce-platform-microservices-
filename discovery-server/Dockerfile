FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
ARG JAR_FILE=target/discovery-server-*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app/app.jar"]