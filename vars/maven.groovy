// vars/gitCheckoutStage.groovy

def call() {
    pipeline {
        agent none

        stages {
            stage('Git Checkout') {
                agent {
                    label "maven"
                }
                steps {
                    script {
                        // Inside 'script', you can use 'git'
                        git 'https://github.com/artisenzubair/my-app.git'
                    }
                }
            }

            // Add more stages as needed
        }

        // Add post section if required
    }
}
