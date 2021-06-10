FROM adoptopenjdk/openjdk11:latest
RUN mkdir /opt/app
COPY build/libs/*.jar /opt/app/
COPY build/resources/main /opt/app/
#CMD ["ls", "/opt/app/"]
CMD ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/opt/app/Project1-0.0.1-SNAPSHOT.jar", "--spring.config.location=file:/opt/app/application-prod.properties"]