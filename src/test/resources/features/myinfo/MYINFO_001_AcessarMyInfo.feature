@smoke1
@myinfo
Feature: Acesso ao módulo My Info

  Como usuário autenticado
  Quero acessar o módulo My Info
  Para visualizar minhas informações pessoais

  Background:
    Given que realizei login com credenciais válidas

  Scenario: Acessar a tela My Info com sucesso

  When acessar o módulo My Info
  
  Then a tela Personal Details deve ser exibida