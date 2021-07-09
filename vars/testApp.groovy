#!/usr/bin/env groovy

def call() {
    echo "testing application...."
    sh 'mvn test'
}
