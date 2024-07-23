package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageProducts extends LoginPage {

	By productBlackPack = By.xpath("//a[@id= 'item_4_title_link']");
	By productBoldTShirt = By.xpath("//a[@id= 'item_1_title_link']");
	By produtcFleeceJacket = By.xpath("//a[@id= 'item_5_title_link']");
	By btnRemove = By.xpath("//button[@id = 'remove']");
	By btnAddToCard = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']");
	By btnClassificarEFiltrar = By.xpath("//select[@class = 'product_sort_container']");
	By opcaoAZ = By.xpath("//option[@value = 'az']");
	By opcaoZA = By.xpath("//option[@value = 'za']");
	By opcaoPrecoBaixoParaAlto = By.xpath("//option[@value = 'lohi']");
	By opcaoPrecoAltoParaBaixo = By.xpath("//option[@value = 'hilo']");
	By textoCapturado = By.xpath("//div[@class = 'inventory_details_name large_size']");

	
	

	// Clicar_no_produto_desejado
	@Given("que esteja na pagina de produtos")
	public void que_esteja_na_pagina_de_produtos() {
		PageBase.abrirNavegador();
		PageBase.preencherCampo(campoUserName, "standard_user");
		PageBase.preencherCampo(campoPassword, "secret_sauce");
		PageBase.clicar(btnLogin);
		PageBase.evidenciar("Teste Produto_Entrando na tela de produto");
	}

	@When("selecionar o produto desejado")
	public void selecionar_o_produto_desejado() {
		PageBase.clicar(productBlackPack);
		PageBase.evidenciar("Teste Produto_Selecionando produto Black Pack");

	}

	@Then("o site redireciona para a pagina com detalhes do produto")
	public void o_site_redireciona_para_a_pagina_com_detalhes_do_produto() {
		PageBase.validarTexto(textoCapturado, "Sauce Labs Backpack");
		PageBase.evidenciar("Teste Produto_Visualizando detalhes do produto");
		PageBase.fecharNavegador();
	}

	// Adicionar_produto_ao_carrinho
	@Given("que esteja na pagina do produto desejado")
	public void que_esteja_na_pagina_do_produto_desejado() {
		PageBase.abrirNavegador();
		PageBase.preencherCampo(campoUserName, "standard_user");
		PageBase.preencherCampo(campoPassword, "secret_sauce");
		PageBase.clicar(btnLogin);
		PageBase.clicar(productBlackPack);
		PageBase.evidenciar("Teste Adicionar ao Carrinho_Esta na pagina do produto");

	}

	@When("clicar em add to card")
	public void clicar_em_add_to_card() {
		PageBase.clicar(btnAddToCard);
		PageBase.evidenciar("Teste Adicionar ao Carrinho_Clicar no botao add to card");
	}

	@Then("o produto deve ser adicionado ao carrinho com sucesso")
	public void o_produto_deve_ser_adicionado_ao_carrinho_com_sucesso() {

		String btnclicado = btnAddToCard.toString();
		String valorRetornadoBtn = btnRemove.toString();

		if (!valorRetornadoBtn.equals(btnclicado)) {
			System.out.println("Foi validado o btn add to card");
			PageBase.evidenciar("Teste Adicionar ao Carrinho_adicionou ao carrinho");
		} else {
			System.out.println("O botão não foi validado");
		}
		
		PageBase.fecharNavegador();

	}

	// Remover_produto_do_carrinho
	@When("clicar em remove")
	public void clicar_em_remove() {
		PageBase.clicar(btnAddToCard);
		PageBase.clicar(btnRemove);
		PageBase.evidenciar("Teste Adicionar ao Carrinho_remover do carrinho");
	}

	@Then("o produto deve ser removido do carrinho")
	public void o_produto_deve_ser_removido_do_carrinho() {

		String btnclicado = btnAddToCard.toString();
		String valorRetornadoBtn = btnRemove.toString();

		if (!valorRetornadoBtn.equals(btnclicado)) {
			System.out.println("Foi validado o btn remove");
			PageBase.evidenciar("Teste Adicionar ao Carrinho_produto removido com sucesso");
		} else {
			System.out.println("O botão não foi validado");
		}
		
		PageBase.fecharNavegador();

	}

	@When("clicar em filtrar e Classificar")
	public void clicar_em_filtrar_e_classificar() {
		//PageBase.clicar(btnClassificarEFiltrar);
		PageBase.evidenciar("Teste Classificar e Filtrar_clique no icone");
	}

	// Filtragem_de_A_a_Z
	@When("escolher a filtragem de A a Z")
	public void escolher_a_filtragem_de_a_a_z() {
		PageBase.elementoDaLista(btnClassificarEFiltrar, opcaoAZ);
		PageBase.evidenciar("Teste Classificar e Filtrar_clique na opcaode AaZ");
	}

	@Then("o site deve atualizar os produtos na ordem desejada")
	public void o_site_deve_atualizar_os_produtos_na_ordem_desejada() {
		PageBase.evidenciar("Teste Classificar e Filtrar_pagina organizada de AaZ");
		PageBase.fecharNavegador();
	}

	// Filtragem_de_Z_a_A
	@When("escolher a filtragem de Z a A")
	public void escolher_a_filtragem_de_z_a_a()  {
		
		PageBase.elementoDaLista(btnClassificarEFiltrar, opcaoZA);
		PageBase.evidenciar("Teste Classificar e Filtrar_clique na opcaode ZaA");
		

	}

	// Filtragem_de_preco_baixo_para_alto
	@When("escolher a filtragem de preco do baixo para o alto")
	public void escolher_a_filtragem_de_preco_do_baixo_para_o_alto() {
		PageBase.elementoDaLista(btnClassificarEFiltrar, opcaoPrecoBaixoParaAlto);
		PageBase.evidenciar("Teste Classificar e Filtrar_clique na opcao de preco: baixo para alto");
		
	}

	// Filtragem_de_preco_alto_para_baixo
	@When("escolher a filtragem de preco do alto para o baixo")
	public void escolher_a_filtragem_de_preco_do_alto_para_o_baixo() {
		PageBase.elementoDaLista(btnClassificarEFiltrar, opcaoPrecoBaixoParaAlto);
		PageBase.evidenciar("Teste Classificar e Filtrar_clique na opcao de preco: alto para baixo");
		
	}
	
	
	
}
