package pages;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class LoginPage {

	 By campoUserName = By.xpath("//input[@id = 'user-name']");
	 By campoPassword = By.xpath("//input[@id = 'password']");
	 By btnLogin = By.xpath("//input[@id = 'login-button']");
	 By mensagemErro = By.xpath("//h3[@data-test = 'error']");

	
	@Given("que esteja na pagina de login")
	public void que_esteja_na_pagina_de_login() {
		PageBase.abrirNavegador();

	}

	@Given("preencha os campos com dados validos")
	public void preencha_os_campos_com_dados_validos() {
		PageBase.preencherCampo(campoUserName, "standard_user");
		PageBase.evidenciar("Teste Login Positivo_Evidencia preenchendo campo nome");
		PageBase.preencherCampo(campoPassword, "secret_sauce");
		PageBase.evidenciar("Teste Login Positivo_Evidencia preenchendo campo senha");
	}

	@When("clicar no botao login")
	public void clicar_no_botao_login() {
		PageBase.clicar(btnLogin);
		PageBase.evidenciar("Teste Login Positivo_Evidencia apos clicar botao login");

	}

	@Then("estou logado com sucesso")
	public void estou_logado_com_sucesso() {
		PageBase.fecharNavegador();
	}

	@Given("preencha os campos com dados invalidos")
	public void preencha_os_campos_com_dados_invalidos() {
		PageBase.preencherCampo(campoUserName, "testtest");
		PageBase.evidenciar("Teste Login Negativo_Evidencia preenchendo campo nome");
		PageBase.preencherCampo(campoPassword, "test");
		PageBase.evidenciar("Teste Login Negativo_Evidencia preenchendo campo senha");
	}

	@Then("o site exibe uma mensagem de erro")
	public void o_site_exibe_uma_mensagem_de_erro() {
		System.out.println(mensagemErro);
		PageBase.evidenciar("Teste Login Negativo_Evidencia mensagem de erro:" + mensagemErro);
		PageBase.fecharNavegador();
		
	}

	@Given("deixe os espacos em branco")
	public void deixe_os_espacos_em_branco() {
		PageBase.preencherCampo(campoUserName, "");
		PageBase.preencherCampo(campoPassword, "");
	}
}
