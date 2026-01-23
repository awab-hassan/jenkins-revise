FROM jenkins/jenkins:lts-jdk17
USER root
#install docker
RUN apt update && \
 apt install -y apt-transport-https ca-certificates curl software-properties-common
&& \
 curl -fsSL https://download.docker.com/linux/ubuntu/gpg | apt-key add - && \
 add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu
focal stable" && \
 apt-cache policy docker-ce && \
 apt install -y docker-ce
#install aws cli
RUN curl "https://awscli.amazonaws.com/awscli-exe-linux-x86_64.zip" -o
"awscliv2.zip" && \
 unzip awscliv2.zip && \
 ./aws/install
RUN curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/
bin/linux/amd64/kubectl" && \
 install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl && \
 chmod +x kubectl && \
 mkdir -p ~/.local/bin && \
 mv ./kubectl ~/.local/bin/kubectl
USER jenkins