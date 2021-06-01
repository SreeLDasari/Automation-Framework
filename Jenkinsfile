pipeline {
    agent any
    stages {
        stage ('Compile Stage') {

            steps {
                withMaven(maven : 'maven3.8.1') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage') {

            steps {
                withMaven(maven : 'maven3.8.1') {
                    bat 'mvn test'
                }
            }
        }
        
    }
}
