@smoke
Feature: Atualização de informações pessoais

  Como usuário autenticado
  Quero atualizar minhas informações pessoais
  Para manter meus dados atualizados

  Background:
    Given que realizei login com credenciais válidas
    And acessar o módulo My Info

  Scenario: Atualizar informações pessoais com sucesso

    When eu atualizo o campo "Other Id" com o valor "123456"
    And salvar as alterações

    Then a mensagem de sucesso deve ser exibida