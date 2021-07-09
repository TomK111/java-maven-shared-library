#!/usr/bin/env groovy

def call() {
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId:'nexus-credentials', passwordVariable:'PASS',
            usernameVariable: 'USER')]) {
        sh 'docker build -t 143.244.148.227:8083/java-maven-app:1.4 .'
        sh "echo $PASS | docker login -u $USER --password-stdin 143.244.148.227:8083"
        sh 'docker push 143.244.148.227:8083/java-maven-app:1.4'
    }
}
