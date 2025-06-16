# 1. Use a lightweight Java image as the base
FROM openjdk:17-jdk-slim

# 2. Set the working directory inside the container
WORKDIR /app

# 3. Copy the JAR file from host to the container
COPY target/employeeTo_do_List-0.0.1-SNAPSHOT.jar app.jar

# 4. Expose port that Spring Boot app uses
EXPOSE 8080

# 5. Command to run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
