pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    triggers {
        pollSCM('H/5 * * * *')
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/GitheTrunk/Final_Exam_DevOps.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                sh '/opt/homebrew/bin/ansible-playbook -i inventory.ini deploy.yml'
            }
        }
    }

    post {
        success {
            echo 'Deployment successful!'
        }

        failure {
            emailext(
                subject: "Build Failed: ${env.JOB_NAME}",
                body: """
Build failed.

Job: ${env.JOB_NAME}
Build Number: ${env.BUILD_NUMBER}

See details:
${env.BUILD_URL}
""",
                to: "srengty@gmail.com"
            )
        }
    }
}