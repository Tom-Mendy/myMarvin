FROM jenkins/jenkins:lts

WORKDIR /var/jenkins_home

# Install make, gcc and libcriterion-dev for testing
USER root
RUN apt-get update && apt-get install build-essential libcriterion-dev -y
USER jenkins

# Install Jenkins plugins
COPY ./plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt

# setup configuration as code configuration
ENV CASC_JENKINS_CONFIG /var/jenkins_home/casc.yaml
COPY ./my_marvin.yml /var/jenkins_home/casc.yaml

# setup job dsl configuration
COPY job_dsl.groovy /var/jenkins_home/job_dsl.groovy

EXPOSE 8080
EXPOSE 50000
