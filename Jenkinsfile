pipeline {
    agent any

    tools {
        maven "M3"
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/antunes-filomeno/ExampleMaven.git'
                sh 'mvn -Dmaven.test.failure.ignore=true clean package'
                echo 'built'
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Test') {
            steps {
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