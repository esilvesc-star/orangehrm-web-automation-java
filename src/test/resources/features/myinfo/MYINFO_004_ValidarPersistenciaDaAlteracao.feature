@smoke
Feature: Persistência das informações pessoais

    Como usuário autenticado
    Quero garantir que as alterações realizadas sejam persistidas
    Para assegurar a integridade das informações

    Background:
        Given que realizei login com credenciais válidas
        And acessar o módulo My Info

    Scenario: Validar persistência da alteração do campo Other Id

        When eu atualizo o campo "Other Id" com o valor "654321"
        And salvar as alterações
        And a mensagem de sucesso deve ser exibida

        Then o campo "Other Id" deve conter o valor "654321"