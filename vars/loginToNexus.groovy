#!/usr/bin/env groovy

def call() {
    echo "logging into Nexus OSS..."
    withCredentials([usernamePassword(credentialsId:'nexus-credentials', passwordVariable:'PASS',
            usernameVariable: 'USER')]) {
        sh "echo $PASS | docker login -u $USER --password-stdin 143.244.148.227:8083"
    }
}


