pipeline {
    agent any

    tools{
        maven 'Maven'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url:'https://github.com/Vinod-Asabe/Calculator.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean compile'
                // sh 'javac -cp junit-4.13.2.jar:. *.java'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn clean test'
                // sh 'java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore CalculatorTest'
            }
        }

        stage("Deploy") {
            steps {
                echo 'Deployed Successfully'
            }
        }
    }
}
