################################################
# Dockerfile to run Groovy containers
# Based on Java 8 image
################################################
 
FROM java:8u40-jdk
 
MAINTAINER Cédric Champeau
 
# Install GVM
RUN curl -s get.gvmtool.net | bash
 
RUN ["/bin/bash", "-c", "source /root/.gvm/bin/gvm-init.sh"]
RUN echo "gvm_suggestive_selfupdate=false" >> /root/.gvm/etc/config
RUN ["/bin/bash", "-c", "-l", "gvm install groovy"]
 
# Fix path
ENV GROOVY_HOME /root/.gvm/groovy/current
ENV PATH $GROOVY_HOME/bin:$PATH

# Adds application
ADD wisdom-shout.groovy /

CMD ["groovy", "wisdom-shout.groovy"]