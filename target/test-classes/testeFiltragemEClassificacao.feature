Feature: Filtragem e Classificacao no site https://www.saucedemo.com/

Como usuario do saucedemo.com
Quero filtrar minhas buscas
Para ter uma melhor visualizacao dos produtos


Scenario: Teste filtrar de A a Z
Given que esteja na pagina de produtos
When clicar em filtrar e Classificar
And escolher a filtragem de A a Z 
Then o site deve atualizar os produtos na ordem desejada


Scenario: Teste filtrar de Z a A
Given que esteja na pagina de produtos
When clicar em filtrar e Classificar
And escolher a filtragem de Z a A 
Then o site deve atualizar os produtos na ordem desejada


Scenario: Teste filtrar de preco do baixo para o alto
Given que esteja na pagina de produtos
When clicar em filtrar e Classificar
And escolher a filtragem de preco do baixo para o alto
Then o site deve atualizar os produtos na ordem desejada



Scenario: Teste filtrar de preco do alto para o baixo
Given que esteja na pagina de produtos
When clicar em filtrar e Classificar
And escolher a filtragem de preco do alto para o baixo
Then o site deve atualizar os produtos na ordem desejada

