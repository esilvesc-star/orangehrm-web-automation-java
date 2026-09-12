@login @negative @regression @LOGIN_003

Feature: Validação de usuário inválido

  Como usuário do sistema
  Quero informar um usuário inexistente
  Para garantir que o sistema não permita o acesso

  Scenario: Não permitir login com usuário inválido

    Given que estou na página de login
    When informo o usuário "UsuarioInvalido"
    And informo a senha "admin123"
    And clico no botão Login
    Then deve ser exibida a mensagem "Invalid credentials"
    And devo permanecer na página de login