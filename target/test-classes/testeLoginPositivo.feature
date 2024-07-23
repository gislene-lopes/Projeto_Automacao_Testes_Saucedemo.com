Feature: Teste login no site https://www.saucedemo.com/
  
  Como cliente do site saucedemo.com
  Quero acessar o meu login
  Para visualizar meus dados e outras informacoes

  Scenario: Teste de Login com dados validos
    Given que esteja na pagina de login
    And preencha os campos com dados validos
    When clicar no botao login
    Then estou logado com sucesso