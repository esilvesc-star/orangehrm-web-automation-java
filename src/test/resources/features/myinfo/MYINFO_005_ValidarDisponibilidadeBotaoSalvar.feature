@myinfo
Feature: Disponibilidade da ação de salvar

  Como usuário autenticado
  Quero visualizar a ação de salvar
  Para conseguir atualizar minhas informações

  Background:
    Given que realizei login com credenciais válidas
    And acessei o módulo "My Info"

  Scenario: Validar disponibilidade do botão Salvar

    Then o botão "Save" deve estar habilitado