Feature: Teste login no site https://www.saucedemo.com/
  
  Como cliente do site saucedemo.com
  Quero acessar o meu login
  Para visualizar meus dados e outras informacoes

  Scenario: Teste login com dados negativos
    Given que esteja na pagina de login
    And preencha os campos com dados invalidos
    When clicar no botao login
    Then o site exibe uma mensagem de erro

  Scenario: Teste login com dados em branco
    Given que esteja na pagina de login
    And deixe os espacos em branco
    When clicar no botao login
    Then o site exibe uma mensagem de erro
