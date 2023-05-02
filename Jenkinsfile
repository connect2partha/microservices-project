pipeline {
	agent any

	environment {
		mavenHome = tool 'apache-maven-3.8.5'
	}

	tools {
		jdk 'openjdk18'
	}

	stages {

		stage('Build'){
			steps {
                withMaven(maven : 'apache-maven-3.8.5') {
                    bat 'mvn clean install -DskipTests'
                }
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    bat "mvn jar:jar deploy:deploy"
			}
		}
	}
}