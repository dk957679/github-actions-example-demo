
FROM openjdk:17
EXPOSE 8080
ADD target/springboot-project-github-actions.jar springboot-project-github-actions.jar
ENTRYPOINT ["java","-jar","/springboot-project-github-actions.jar"]