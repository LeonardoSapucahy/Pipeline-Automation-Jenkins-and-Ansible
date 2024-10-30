pipeline {
    agent any
    stages {
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                ansiblePlaybook playbook: 'ansible/playbooks/deploy.yml'
            }
        }
    }
    post {
        success {
            echo 'Deploy realizado com sucesso'
        }
        failure {
            echo 'Erro durante o deploy'
        }
    }
}
