# Use a specific Java runtime base image (Alpine is smaller)
FROM eclipse-temurin:17-jre-alpine

# Set working directory
WORKDIR /app

# Argument for the JAR file path (makes it easier to manage versions if needed)
# Make sure the JAR name pattern matches what your build produces
ARG JAR_FILE=target/shopping-cart-service-*.jar

# Copy the executable JAR file to the container
COPY ${JAR_FILE} app.jar

# Expose the port the app runs on (e.g., 8080 if that's what Spring Boot uses by default)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]