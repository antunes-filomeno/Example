pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Test.java'
                echo 'built'
            }
        }
        stage('Test') {
            steps {
                sh 'java Test'
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