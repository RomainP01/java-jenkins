pipeline {
  agent any
  stages {
    stage('check') {
      parallel {
        stage('pmd') {
          steps {
            sh './mvnw pmd:check'
          }
        }

        stage('checkstyle') {
          steps {
            sh './mvnw checkstyle:check'
          }
        }

        stage('test') {
          steps {
            sh './mvnw test'
          }
        }

      }
    }

    stage('test') {
      steps {
        sh './mvnw test'
      }
    }

  }
}