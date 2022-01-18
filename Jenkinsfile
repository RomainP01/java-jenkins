pipeline {
  agent any
  stages {
    stage('mvnw check') {
      steps {
        sh './mvn pmd:check'
      }
    }

  }
}