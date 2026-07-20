@smoke
Feature: Navegação da tela My Info

  Como usuário autenticado
  Quero visualizar as seções da tela My Info
  Para garantir que a navegação esteja disponível

  Background:
    Given que realizei login com credenciais válidas
    And acessar o módulo My Info

  Scenario: Validar as seções disponíveis da tela My Info

    Then as seguintes seções devem estar disponíveis

      | Personal Details |
      | Contact Details |
      | Emergency Contacts |
      | Dependents |
      | Immigration |
      | Job |
      | Salary |
      | Report-to |
      | Qualifications |
      | Memberships |