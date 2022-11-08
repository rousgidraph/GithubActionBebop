FROM openjdk:11
EXPOSE 90
ADD target/spring-github-bebop.jar spring-github-bebop.jar
ENTRYPOINT ["java","-jar","/spring-github-bebop.jar"]