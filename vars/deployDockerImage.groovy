#!/usr/bin/env groovy

def call() {
    echo "deploying the docker image..."
    withCredentials([usernamePassword(credentialsId:'nexus-credentials', passwordVariable:'PASS',
            usernameVariable: 'USER')]) {
        sh 'docker push 134.122.20.106:8083/java-maven-app:1.4'
    }
}