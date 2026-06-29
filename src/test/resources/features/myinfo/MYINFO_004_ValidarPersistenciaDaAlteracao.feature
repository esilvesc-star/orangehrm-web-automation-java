@myinfo
Feature: Persistência das informações pessoais

  Como usuário autenticado
  Quero garantir que as alterações realizadas sejam persistidas
  Para assegurar a integridade das informações

  Background:
    Given que realizei login com credenciais válidas
    And acessei o módulo "My Info"

  Scenario: Validar persistência da alteração realizada

    When alterar o campo "Other Id"
    And salvar as alterações
    And atualizar a página

    Then o valor informado deve permanecer no campo "Other Id"