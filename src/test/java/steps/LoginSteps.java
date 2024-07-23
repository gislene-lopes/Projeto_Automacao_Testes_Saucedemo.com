package steps;



import pages.LoginPage;

public class LoginSteps {

	LoginPage step = new LoginPage();

	// Teste_login_com_dados_validos

	
	public void testeLoginPositivo() {
		step.que_esteja_na_pagina_de_login();
		step.preencha_os_campos_com_dados_validos();
		step.clicar_no_botao_login();
		step.estou_logado_com_sucesso();
	

	}
	
	public void testeLoginNegativoDadosInvalidos() {
		step.que_esteja_na_pagina_de_login();
		step.preencha_os_campos_com_dados_invalidos();
		step.clicar_no_botao_login();
		step.o_site_exibe_uma_mensagem_de_erro();
		
		
	}
	
	public void testeLoginNegativoDadosEmBranco() {
		step.que_esteja_na_pagina_de_login();
		step.deixe_os_espacos_em_branco();
		step.clicar_no_botao_login();
		step.o_site_exibe_uma_mensagem_de_erro();
		
	}
	

}
