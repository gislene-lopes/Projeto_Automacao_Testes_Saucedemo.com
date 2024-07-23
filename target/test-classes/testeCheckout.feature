Feature: Checkout no site https://www.saucedemo.com/
  
  Como usuario do saucedemo.com
  Quero realizar o checkout
  Para finalizar minha compra
  E outras informacoes

  Scenario: Teste checkout com dados validos
    Given que esteja no carrinho
    And clique no botao checkout
    And preencher os campos checkout com dados validos
    When clicar no botao continue
    Then o sistema aceita e faz o checkout

  Scenario: Teste checkout com dados invalidos
    Given que esteja no carrinho
    And preencher os campos checkout com dados invalidos
    When clicar no botao continue
    But o sistema aceita 
    Then faz o checkout

  Scenario: Teste checkout com dados em branco
    Given que esteja no carrinho
    And clique no botao checkout
    And deixar os campos checkout em branco
    When clicar no botao continue
    Then o sistema exibe uma mensagem de erro

   Scenario: Teste finalizando a compra
   
   Given que esteja com o checkout realizado
   When clicar em finish
   Then o site finaliza a compra 
   And exibe uma mensagem de agradecimento