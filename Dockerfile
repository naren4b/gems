FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENV ENV_BG_COLOR="RED"
ENV ENV_MSG="Gems color is RED" 
ENTRYPOINT ["java","-jar","/app.jar"]