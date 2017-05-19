pipeline {
    agent any

    stages {
        stage('clone') {
            steps {
                git 'https://github.com/LuckySkynet/jenkins-test.git'
            }
        }
        stage('test'){
            steps {
                sh 'mvn clean test'
            }
        }
        stage('build') {
            steps {
                sh 'mvn -Dmaven.test.skip=true package'
            }
        }
        stage('deploy') {
                sh 'java -jar target\\jenkins-demo-1.0-SNAPSHOT.jar'
                echo 'pipeline success'
        }
    }
}