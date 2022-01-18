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

        stage('sonar') {
          steps {
            sh '''./mvnw clean verify sonar:sonar \\
  -Dsonar.projectKey=JenkinsTP \\
  -Dsonar.host.url=http://sonarqube:8084 \\
  -Dsonar.login=b1cf64eb9934efe289666927868828a46efe9ecc'''
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