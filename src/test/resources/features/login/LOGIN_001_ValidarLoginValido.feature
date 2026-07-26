
@smoke

Feature: Login

  Scenario: Realizar login com credenciais válidas

    Given que estou na página de login do OrangeHRM
    When realizo login com credenciais válidas
    Then devo ser redirecionado para a tela inicial

