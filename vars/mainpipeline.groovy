def call(Map config) {
    pipeline {
        agent any
        stages {
            stage('Download Code') { steps { checkout scm } }
            stage('Build App') { steps { echo "Building ${config.appName}..." } }
            stage('Security Scan') { steps { echo "Scanning ${config.appName} for bugs..." } }
            stage('Deploy') { steps { echo "Deploying to Production..." } }
        }
    }
}
