FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
ARG JAR_FILE=target/api-gateway-*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 9090
ENTRYPOINT ["java", "-jar", "/app/app.jar"]