FROM openjdk:8
ADD target/HelloWorldAPI.jar HelloWorldAPI.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "HelloWorldAPI.jar"]