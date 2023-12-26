FROM tomcat:8.0.53
LABEL app=my-app
COPY target/*.war /usr/local/tomcat/webapps/myweb.war
