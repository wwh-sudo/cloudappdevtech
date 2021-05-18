FROM tomcat
MAINTAINER bobyuan

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
WORKDIR $CATALINA_HOME

# Tomcat will extract war copied to webapp directory.
COPY ["./target/CounterWebApp.war", "/usr/local/tomcat/webapps/CounterWebApp.war"]

CMD ["catalina.sh", "run"]

