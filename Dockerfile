FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/myweb-0.0.9.war /app/
EXPOSE 8081
CMD ["java", "-jar", "myweb-0.0.9.war" ] 




