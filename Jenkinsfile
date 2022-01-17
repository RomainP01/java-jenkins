pipeline {
  agent {
    docker {
      image 'maven:3-alpine'
    }

  }
  stages {
    stage('mvnw check') {
      steps {
        sh './mvnw pmd:check'
      }
    }

  }
}