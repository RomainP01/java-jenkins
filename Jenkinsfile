pipeline {
  agent {
    docker {
      image 'maven:3.8.4-eclipse-temurin-16-alpine'
    }

  }
  stages {
    stage('mvnw check') {
      steps {
        sh './nvmw pwd:check'
      }
    }

  }
}