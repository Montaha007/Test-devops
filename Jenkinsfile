pipeline {
    agent any

    tools {
        jdk 'JDK-21'
    }

    stages {

        stage('Checkout code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/Montaha007/Test-devops.git'
            }
        }

        stage('Compile code') {
            steps {
                sh 'javac -d . src/Test.java'
            }
        }

        stage('Execute code') {
            steps {
                sh 'java Test'
            }
        }

    }
}