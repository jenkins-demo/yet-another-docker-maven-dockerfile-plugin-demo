FROM maven:3.5.4-jdk-8

RUN apt-get update && apt-get install -y \
    openssh-server \
    && rm -rf /var/lib/apt/lists/*

RUN curl -fsSL https://download.docker.com/linux/static/stable/`uname -m`/docker-18.03.0-ce.tgz | tar --strip-components=1 -xz -C /usr/local/bin docker/docker

# setup sshd like https://github.com/rastasheep/ubuntu-sshd/blob/master/18.04/Dockerfile
# obviously not a production grade setup :)
RUN mkdir /var/run/sshd

RUN echo 'root:root' |chpasswd

RUN sed -ri 's/^#?PermitRootLogin\s+.*/PermitRootLogin yes/' /etc/ssh/sshd_config
RUN sed -ri 's/UsePAM yes/#UsePAM yes/g' /etc/ssh/sshd_config

RUN mkdir /root/.ssh

EXPOSE 22

CMD ["/usr/sbin/sshd", "-D"]