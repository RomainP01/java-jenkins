pipeline {
  agent none
  stages {
    stage('mvnw check') {
      steps {
        sh './mvnw pmd:check'
      }
    }

  }
}