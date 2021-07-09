#!/usr/bin/env groovy

def call() {
    echo "deploying the docker image..."
    withCredentials([usernamePassword(credentialsId:'nexus-credentials', passwordVariable:'PASS',
            usernameVariable: 'USER')]) {
        sh 'docker push 143.244.148.227:8083/java-maven-app:1.4'
    }
}
