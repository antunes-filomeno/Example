pipeline {
    agent { docker { image 'maven:3.8.6-openjdk-11-slim' } }

    stages {
        stage('Build') {
            steps {
                sh 'mvn --version'
                echo 'built'
            }
        }
        stage('test') {
            steps {
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