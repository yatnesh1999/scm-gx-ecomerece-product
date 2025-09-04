# Use a lightweight OpenJDK base image
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the built JAR file (replace with your actual jar name or use COPY wildcard)
COPY build/libs/ecomerece-product-0.0.1-SNAPSHOT.jar app.jar

# Expose port (match your Spring Boot server.port, usually 8080)
EXPOSE 8080

# Run the jar
ENTRYPOINT ["java", "-jar", "app.jar"]

