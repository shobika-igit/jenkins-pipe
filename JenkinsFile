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
                bat 'if not exist out mkdir out'
                bat 'javac -d out src\\main\\java\\org\\example\\Main.java'
            }
        }


        stage('Execute') {
            steps {
                bat 'java -cp out org.example.Main 121'
            }
        }
    }
}