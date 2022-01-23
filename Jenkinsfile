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

        stage('nexus') {
          steps {
            sh './mvnw clean deploy'
          }
        }

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
  -Dsonar.host.url=http://sonarqube:9000 \\
  -Dsonar.login=a7f4a2a8334b74aa215f39b816af97290f55026b'''
      }
    }

  }
}