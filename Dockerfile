FROM maven:3.8.1-openjdk-11-slim
WORKDIR /usr/app
COPY . /usr/app
RUN mvn clean install
ENTRYPOINT ["mvn", "jetty:run"]
EXPOSE 8080
