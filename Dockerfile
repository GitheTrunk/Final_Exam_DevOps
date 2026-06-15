FROM eclipse-temurin:23-jdk

RUN apt-get update && \
    apt-get install -y nginx openssh-server git curl php && \
    mkdir /var/run/sshd

EXPOSE 80 22 8080

CMD service ssh start && \
    nginx -g "daemon off;"