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
                sh '''
                mkdir -p out
                /usr/lib/jvm/java-17-openjdk-amd64/bin/javac -d out src/main/java/org/example/Main.java
                '''
            }
        }


        stage('Execute') {
            steps {
                sh '''
                /usr/lib/jvm/java-17-openjdk-amd64/bin/java -cp out org.example.Main 121
                '''
            }
        }
    }
}