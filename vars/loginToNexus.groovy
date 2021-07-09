#!/usr/bin/env groovy

echo "logging into Nexus..."
withCredentials([usernamePassword(credentialsId:'nexus-credentials', passwordVariable:'PASS',
        usernameVariable: 'USER')]) {
    sh "echo $PASS | docker login -u $USER --password-stdin 134.122.20.106:8083"
}