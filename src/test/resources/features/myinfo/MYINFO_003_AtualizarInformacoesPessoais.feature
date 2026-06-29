@smoke
@myinfo
Feature: Atualização de informações pessoais

  Como usuário autenticado
  Quero atualizar minhas informações pessoais
  Para manter meus dados atualizados

  Background:
    Given que realizei login com credenciais válidas
    And acessei o módulo "My Info"

  Scenario: Atualizar informações pessoais com sucesso

    When alterar o campo "Other Id"
    And salvar as alterações

    Then a mensagem de sucesso deve ser exibida