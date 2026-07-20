@smoke
Feature: Navegação da tela My Info

  Background:
    Given que realizei login com credenciais válidas
    And acessar o módulo My Info

  Scenario: Validar as seções disponíveis na tela My Info
    Then as seguintes seções devem estar disponíveis:
      | Personal Details   |
      | Contact Details    |
      | Emergency Contacts |
      | Dependents         |
      | Immigration        |
      | Job                |
      | Salary             |
      | Report-to          |
      | Qualifications     |
      | Memberships        |