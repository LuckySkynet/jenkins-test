pipeline {
  agent any
  stages {
    stage('clone') {
      steps {
        parallel(
          "clone": {
            script {
              git 'https://github.com/LuckySkynet/jenkins-test.git'
            }
            
            
          },
          "test": {
            sh 'sh \'mvn clean test\''
            
          },
          "build": {
            sh 'sh \'mvn -Dmaven.test.skip=true package\''
            
          }
        )
      }
    }
    stage('deploy') {
      steps {
        sh 'sh \'java -jar target\\jenkins-demo-1.0-SNAPSHOT.jar\''
      }
    }
  }
}