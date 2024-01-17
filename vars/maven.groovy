// shared-library/vars/mavenBuild.groovy

def call() {
    pipeline {
        agent any

        stages {
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
