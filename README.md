# Projeto: Automação de Deploys com Jenkins e Ansible

Automação de pipelines de CI/CD usando Jenkins para integração contínua e Ansible para implantação automatizada de aplicativos. Inclui scripts de configuração e exemplos de playbooks.

## Descrição do Projeto

Este projeto tem como objetivo automatizar o processo de deploy de aplicações utilizando Jenkins e Ansible. O Jenkins é utilizado para gerenciar a integração contínua (CI) enquanto o Ansible é usado para a implantação automatizada (CD). 

### Ferramentas Utilizadas
- **Jenkins**: Ferramenta de integração contínua para automação de processos de build e deploy.
- **Ansible**: Ferramenta de automação para gestão de configuração e deploy de aplicações.

### Funcionalidades
- **Pipelines CI/CD**: Automação completa desde o commit de código até a implantação em produção.
- **Playbooks Ansible**: Scripts de configuração e automação de tarefas.

## Estrutura do Projeto

A estrutura do projeto está organizada da seguinte forma: 

      /jenkins
        /pipelines
          - pipeline-ci.groovy    # Script Groovy para a pipeline de integração contínua (CI)
          - pipeline-cd.groovy    # Script Groovy para a pipeline de entrega contínua (CD)
      /ansible
        /playbooks
          - deploy.yml            # Playbook do Ansible para o deploy da aplicação
          - configure.yml         # Playbook do Ansible para configurar a aplicação
        /roles
          /webserver
            - tasks/main.yml      # Tarefas principais da role webserver no Ansible
