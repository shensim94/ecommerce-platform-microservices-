FROM eclipse-temurin:17-jre-alpine

# Set working directory
WORKDIR /app

# Argument for the JAR file path (makes it easier to manage versions)
ARG JAR_FILE=target/user-service-*.jar

# Copy the executable JAR file to the container
COPY ${JAR_FILE} app.jar

# Expose the port the app runs on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]