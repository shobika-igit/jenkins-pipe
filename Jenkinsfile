pipeline {
    agent any


    stages {


        stage('Checkout') {
            steps {
                checkout scm
            }
        }


        stage('Compile') {
            steps {
                sh 'mkdir -p out'
                sh 'javac -d out src/main/java/org/example/Main.java'
            }
        }


        stage('Execute') {
            steps {
                sh 'java -cp out org.example.Main 121'
            }
        }
    }
}