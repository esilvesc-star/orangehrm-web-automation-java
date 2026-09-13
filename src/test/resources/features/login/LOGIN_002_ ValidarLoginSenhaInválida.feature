@login @negative @regression @LOGIN_002
Feature: Validação de login com credenciais inválidas

  Scenario: Não permitir login com senha inválida
    Given que estou na página de login do OrangeHRM
    When informo um usuário válido
    And informo uma senha inválida
    And solicito o acesso
    Then devo visualizar a mensagem "Invalid credentials"