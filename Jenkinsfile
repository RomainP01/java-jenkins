pipeline {
  agent any
  stages {
    stage('mvnw check') {
      parallel {
        stage('mvnw check') {
          steps {
            sh './mvnw pmd:check'
          }
        }

        stage('checkstyle') {
          steps {
            sh './mvn checkstyle:check'
          }
        }

      }
    }

  }
}