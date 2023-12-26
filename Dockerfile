FROM tomcat:8
LABEL app=my-app
COPY /var/lib/jenkins/workspace/test/target/*.war /usr/local/tomcat/webapps/myweb.war
