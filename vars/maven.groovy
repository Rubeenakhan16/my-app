// vars/gitCheckoutStage.groovy

def call() {
    pipeline {
        agent any

        stages {
            stage('Git Checkout') {
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
