FROM  openjdk:17
EXPOSE 8080
ADD target/springboot-jenkins-dockerhub.jar  springboot-jenkins-dockerhub.jar
ENTRYPOINT ["java","-jar","springboot-jenkins-dockerhub.jar"]