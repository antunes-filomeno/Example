pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac test.java'
                echo 'built'
            }
        }
        stage('Test') {
            steps {
                sh 'java test'
                echo 'tested'
            }
        }
        stage('Deploy'){
            steps {
                echo 'deployed'
            }
        }
    }

}