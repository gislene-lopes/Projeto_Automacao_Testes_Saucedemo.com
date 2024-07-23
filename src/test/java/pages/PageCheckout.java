package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PageCheckout extends PageProducts {

	By iconeCarrinho = By.xpath("//a[@class = 'shopping_cart_link']");
	By btnCheckout = By.xpath("//button [@class = 'btn btn_action btn_medium checkout_button ']");
	By campoFistName = By.xpath("//input[@id = 'first-name']");
	By campoLastName = By.xpath("//input[@id = 'last-name']");
	By campoPostalCode = By.xpath("//input[@id = 'postal-code']");
	By btnContinue = By.xpath("//input[@id = 'continue']");
	By tituloCheckoutOk = By.xpath("//span [@class = 'title']");
	By msgErroCheckoutBranco = By.xpath("//h3 [@data-test= 'error']");
	By btnFinish = By.xpath("//button [@id = 'finish']");
	By msgAgradecimento = By.xpath("//h2 [@class = 'complete-header']");

	@Given("que esteja no carrinho")
	public void que_esteja_no_carrinho() {
		PageBase.abrirNavegador();
		PageBase.preencherCampo(campoUserName, "standard_user");
		PageBase.preencherCampo(campoPassword, "secret_sauce");
		PageBase.clicar(btnLogin);
		PageBase.clicar(produtcFleeceJacket);
		PageBase.clicar(btnAddToCard);
		PageBase.clicar(iconeCarrinho);
		PageBase.evidenciar("Teste Checkout_Entrando na tela do carrinho");

	}

	@And("clique no botao checkout")
	public void clique_no_botao_checkout() {
		PageBase.clicar(btnCheckout);
		PageBase.evidenciar("Teste Checkout_Entrando na tela de checkout");

	}

	@And("preencher os campos checkout com dados validos")
	public void preencher_os_campos_checkout_com_dados_validos() {
		PageBase.preencherCampo(campoFistName, "Suzui");
		PageBase.preencherCampo(campoLastName, "Alvez");
		PageBase.preencherCampo(campoPostalCode, "64063-200");
		PageBase.evidenciar("Teste Checkout_Pagina checkout preenchida");
	}

	@When("clicar no botao continue")
	public void clicar_no_botao_continue() {
		PageBase.clicar(btnContinue);

	}

	@Then("o sistema aceita e faz o checkout")
	public void o_sistema_aceita_e_faz_o_checkout() {
		PageBase.validarTexto(tituloCheckoutOk, "Checkout: Overview");
		PageBase.evidenciar("Teste Checkout_Pagina checkout com sucesso");
		PageBase.fecharNavegador();
	}

	@And("preencher os campos checkout com dados invalidos")
	public void preencher_os_campos_checkout_com_dados_invalidos() {	
		PageBase.clicar(btnCheckout);
		PageBase.preencherCampo(campoFistName, "XXX");
		PageBase.preencherCampo(campoLastName, "xxx");
		PageBase.preencherCampo(campoPostalCode, "xxx");
		PageBase.evidenciar("Teste Checkout_Dados Invalidos");
		
		
		
	}

	@But("o sistema aceita")
	public void o_sistema_aceita() {
		PageBase.validarTexto(tituloCheckoutOk, "Checkout: Overview");
		System.out.println("Cheguei ate aqui");

	}

	@Then("faz o checkout")
	public void faz_o_checkout() {
		
		PageBase.evidenciar("Teste Checkout_O site aceitou o login com dados invalidos");
		PageBase.fecharNavegador();
	}

	@And("deixar os campos checkout em branco")
	public void deixar_os_campos_checkout_em_branco() {
		PageBase.preencherCampo(campoFistName, "");
		PageBase.preencherCampo(campoLastName, "");
		PageBase.preencherCampo(campoPostalCode, "");
		PageBase.clicar(btnContinue);
	}

	@Then("o sistema exibe uma mensagem de erro")
	public void o_sistema_exibe_uma_mensagem_de_erro() {
		PageBase.validarTexto(msgErroCheckoutBranco, "Error: First Name is required");
		PageBase.evidenciar("Teste Checkout_mensagem de erro apos logar com dados em branco");
		PageBase.fecharNavegador();
	}

	@Given("que esteja com o checkout realizado")
	public void que_esteja_com_o_checkout_realizado() {
		PageBase.abrirNavegador();
		PageBase.preencherCampo(campoUserName, "standard_user");
		PageBase.preencherCampo(campoPassword, "secret_sauce");
		PageBase.clicar(btnLogin);
		PageBase.clicar(productBoldTShirt);
		PageBase.clicar(btnAddToCard);
		PageBase.clicar(iconeCarrinho);
		PageBase.clicar(btnCheckout);
		PageBase.preencherCampo(campoFistName, "Maria");
		PageBase.preencherCampo(campoLastName, "Lucia");
		PageBase.preencherCampo(campoPostalCode, "64205-612");
		PageBase.clicar(btnContinue);
		PageBase.evidenciar("Teste finalizar compra_Dado que você esteja com o checkout realizado");
		
	}

	@When("clicar em finish")
	public void clicar_em_finish() {
		PageBase.clicar(btnFinish);
	}

	@Then("o site finaliza a compra")
	public void o_site_finaliza_a_compra() {
		PageBase.evidenciar("teste finalizar compra_compra realizada com sucesso");
		
	}

	@And("exibe uma mensagem de agradecimento")
	public void exibe_uma_mensagem_de_agradecimento() {
		PageBase.validarTexto(msgAgradecimento, "Thank you for your order!");
		PageBase.fecharNavegador();
	}
}
