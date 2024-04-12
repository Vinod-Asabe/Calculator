pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/yourusername/yourrepository.git'
            }
        }

        stage('Build') {
            steps {
                sh 'javac -cp junit-4.13.2.jar:. *.java'
            }
        }

        stage('Test') {
            steps {
                sh 'java -cp junit-4.13.2.jar:hamcrest-core-1.3.jar:. org.junit.runner.JUnitCore CalculatorTest'
            }
        }
    }
}
