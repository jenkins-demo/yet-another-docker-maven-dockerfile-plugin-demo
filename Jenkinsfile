pipeline {
    
    agent {
        node {
         label 'docker'
        }
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
    }
}
