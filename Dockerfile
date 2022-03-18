FROM adoptopenjdk/openjdk11:alpine-slim
ADD target/spring-webflux-gateway-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "/app.jar"]