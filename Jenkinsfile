pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'javac Test.java'
                echo 'Built'
            }
        }
        stage('Test') {
            steps {
                sh 'java Test'
                echo 'Tested'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deployed'
            }
        }
    }

}