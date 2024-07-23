package steps;

import pages.PageCheckout;

public class CheckoutStep {

	PageCheckout step = new PageCheckout();

	public void testeCheckoutComDadosValidos() {
		step.que_esteja_no_carrinho();
		step.clique_no_botao_checkout();
		step.preencher_os_campos_checkout_com_dados_validos();
		step.clicar_no_botao_continue();
		step.o_sistema_aceita_e_faz_o_checkout();

	}

	public void testeCheckoutComDadosInvalidos() {
		step.que_esteja_no_carrinho();
		step.preencher_os_campos_checkout_com_dados_invalidos();
		step.clicar_no_botao_continue();
		step.o_sistema_aceita();
		step.faz_o_checkout();

	}

	public void testeCheckoutComDadosEmBranco() {
		step.que_esteja_no_carrinho();
		step.clique_no_botao_checkout();
		step.deixar_os_campos_checkout_em_branco();
		step.o_sistema_exibe_uma_mensagem_de_erro();
	}

	public void testeFinalizandoACompra() {
		step.que_esteja_com_o_checkout_realizado();
		step.clicar_em_finish();
		step.o_site_finaliza_a_compra();
		step.exibe_uma_mensagem_de_agradecimento();
	}

}
