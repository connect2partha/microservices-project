pipeline {
	agent any
	tools {
        jdk 'openjdk17'
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
                withMaven(maven : 'apache-maven-3.8.5') {
                    bat 'mvn test'
                }
			}
		}
		stage('Deploy') {
			steps {
			    withMaven(maven : 'apache-maven-3.8.5') {
                    bat 'mvn jar:jar deploy:deploy'
                }
			}
		}
	}
}