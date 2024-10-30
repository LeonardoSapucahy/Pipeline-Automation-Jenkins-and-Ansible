pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                // Adicionar etapas de build
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                // Adicionar etapas de teste
            }
        }
        stage('Package') {
            steps {
                echo 'Packaging...'
                // Adicionar etapas de empacotamento
            }
        }
    }
    post {
        success {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
            echo 'Build e Testes concluídos com sucesso'
        }
        failure {
            echo 'Erro durante o build ou os testes'
        }
    }
}
