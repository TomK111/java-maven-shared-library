#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId:'nexus-credentials', passwordVariable:'PASS',
            usernameVariable: 'USER')]) {
        sh 'docker build -t 134.122.20.106:8083/java-maven-app:1.4 .'
    }
}