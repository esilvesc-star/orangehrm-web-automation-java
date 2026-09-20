@login @negative @regression @LOGIN_003

Feature: Validação de login com credenciais inválidas

Scenario: Não permitir login com usuário inválido
    Given que estou na página de login do OrangeHRM
    When informo um usuário inválido
    And informo uma senha válida
    And solicito o acesso
    Then devo visualizar a mensagem "Invalid credentials"