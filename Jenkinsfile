pipeline {
  agent any
  stages {
    stage('Init') {
      parallel {
        stage('Init') {
          steps {
            echo 'We are Starting the Testing'
          }
        }

        stage('') {
          steps {
            echo 'hello \'$fname\''
          }
        }

      }
    }

    stage('Build') {
      steps {
        echo 'Building Sample Maven Project'
      }
    }

    stage('Deploy') {
      steps {
        echo 'Deploying in Staging Area'
      }
    }

    stage('Deploy Production') {
      steps {
        echo 'Deploying in Production Area'
      }
    }

  }
  environment {
    fname = 'himanshu'
  }
}