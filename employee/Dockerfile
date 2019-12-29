FROM tomcat:9.0
RUN echo 'Deploying War on Server'
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/employee-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]
FROM mysql:latest
ENV MYSQL_ROOT_PASSWORD Welcome123
ENV MYSQL_DATABASE personsdetails
ENV MYSQL_USER root
ENV MYSQL_PASSWORD Welcome123
ADD employee-0.0.1-SNAPSHOT.war /docker-entrypoint-initdb.d
EXPOSE 3306
