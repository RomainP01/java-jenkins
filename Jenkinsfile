pipeline {
  agent any
  stages {
    stage('mvnw check') {
      steps {
        sh './mvnw pmd:check'
      }
    }

  }
}