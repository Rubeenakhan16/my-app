// shared-library/vars/mavenBuild.groovy

def call() {
    pipeline {
        agent any
    tools  {
        maven 'maven'
    }
        stages {
            stage('gitcheckout') {
                steps {
                    git 'https://github.com/artisenzubair/my-app.git'
                }
            }
            stage('Maven Build') {
                steps {
                    script {
                        // Run Maven with 'clean install'
                        sh 'mvn clean install'
                    }
                }
            }
        }

        post {
            success {
                echo 'Maven build successful!'
            }
            failure {
                echo 'Maven build failed!'
            }
        }
    }
}
