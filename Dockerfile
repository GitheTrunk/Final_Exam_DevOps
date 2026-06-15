FROM eclipse-temurin:23-jdk

RUN apt-get update && \
    apt-get install -y nginx openssh-server git curl php maven && \
    mkdir /var/run/sshd

WORKDIR /app

COPY . /app

EXPOSE 80 22 8080

CMD service ssh start && \
    mvn spring-boot:run 