FROM adoptopenjdk:11-jdk-hotspot-bionic
ARG JAR-FILE=target/*.jar
COPY ./target/CategoryAndPolicy-Microservice-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "java", ".jar", "/app.jar"]



# # Use the official OpenJDK image as the base image
# FROM openjdk:11

# # Set the working directory inside the container
# WORKDIR /usr/src/app

# # Copy the compiled JAR file into the container
# COPY target/*.jar app.jar
# # COPY target/*.jar app.jar


# # Define the command to run your application
# CMD ["java", "-jar", "app.jar"]
# # ENTRYPOINT ["java","-jar","/app.jar"]



# # Docker documentation
# FROM eclipse-temurin
# ARG JAR_FILE=target/*.jar
# COPY ${JAR_FILE} app.jar
# EXPOSE 8080
# ENTRYPOINT ["java", "-jar", "/app.jar"]







# FROM eclipse-temurin:17-jdk-jammy as builder
# WORKDIR /opt/app
# COPY .mvn/ .mvn
# COPY mvnw pom.xml ./
# RUN ./mvnw dependency:go-offline
# COPY ./src ./src
# RUN ./mvnw clean install

# FROM eclipse-temurin:17-jre-jammy
# WORKDIR /opt/app
# EXPOSE 8080
# COPY --from=builder /opt/app/target/*.jar /opt/app/*.jar
# ENTRYPOINT ["java", "-jar", "/opt/app/*.jar" ]