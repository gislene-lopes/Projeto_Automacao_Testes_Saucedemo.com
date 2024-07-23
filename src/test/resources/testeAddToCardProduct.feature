Feature: Teste add to card no site https://www.saucedemo.com/

 Como usuario do site saucedemo
 Quero adicionar produtos no meu carrinho
 Para finalizar a compra
 E obter os produtos escolhidos
 
 
 Scenario: Teste adicionar produto no carrinho
 Given que esteja na pagina do produto desejado
 When clicar em add to card
 Then o produto deve ser adicionado ao carrinho com sucesso
 
 Scenario: Teste retirar produto do carrinho
 Given que esteja na pagina do produto desejado
 When clicar em remove
 Then o produto deve ser removido do carrinho
 