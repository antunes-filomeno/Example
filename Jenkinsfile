pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac test.java'
                echo 'built'
            }
        }
        stage('test') {
            steps {
                sh 'java test'
                echo 'tested'
            }
        }
        stage('deploy'){
            steps {
                echo 'deployed'
            }
        }
    }

}