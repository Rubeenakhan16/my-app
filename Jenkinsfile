pipeline {
    agent none

    stages {
        stage('git checkout') {
            agent {
                label "maven"
            }
            steps {
                git 'https://github.com/artisenzubair/my-app.git'
            }
        }
        stage('SonarQube Analysis') {
            agent {
                label "maven"
            }
            steps {
                script {
                    withSonarQubeEnv('sonarqube') {
                        withCredentials([string(credentialsId: 'sonarqube', variable: 'SONARQUBE_TOKEN')]) {
                            sh """mvn clean verify sonar:sonar \
                                -Dsonar.projectKey=demo \
                                -Dsonar.host.url=http://100.24.253.252:9000 \
                                -Dsonar.login=$SONARQUBE_TOKEN"""
                        }
                    }
                }
            }
        }
        stage('build') {
            agent {
                label "tomcat"
            }
            steps {
                sh "mvn clean install"
            }
        }
        stage('tomcat') {
            agent {
                label "tomcat"
            }
            steps {
             sh "cp /home/ubuntu/workspace/assign/target/myweb-0.0.9.war /opt/tomcat/apache-tomcat-9.0.68/webapps/"
            }
        }
    }
    }
