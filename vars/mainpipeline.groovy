def call(String appName) {    
    pipeline {
        agent any
        stages {
            stage('Checkout') {
                steps {
                    checkout scm
                }
            }
            stage('Build') {
                steps {
                    echo "Building Application: ${appName}"
                }
            }
            stage('Test') {
                steps {
                    echo "Testing Application: ${appName}"
                }
            }
            stage('Deploy') {
                steps {
                    echo "Deploying ${appName} to Production Server..."
                }
            }
        }
    }
}
