package runner;

import org.junit.jupiter.api.Test;

import steps.AddToCardStep;
import steps.CheckoutStep;
import steps.ClassificarEFiltrarStep;
import steps.LoginSteps;
import steps.ProdutoStep;

public class RunnerBase {

	LoginSteps login = new LoginSteps();
	ProdutoStep produto = new ProdutoStep();
	ClassificarEFiltrarStep filtrar = new ClassificarEFiltrarStep();
	AddToCardStep carrinho = new AddToCardStep();
	CheckoutStep checkout = new CheckoutStep();
	
	@Test
	public void executa() {
		
		//Testes_Checkout
		checkout.testeCheckoutComDadosValidos();
		checkout.testeCheckoutComDadosInvalidos();
		checkout.testeCheckoutComDadosEmBranco();
		checkout.testeFinalizandoACompra();
		
		
		/*
		// Testes_Login
		login.testeLoginPositivo();
		login.testeLoginNegativoDadosEmBranco();
		login.testeLoginNegativoDadosInvalidos();

		// Teste_produto
		produto.testeSelecionarProduto();
		

		// Testes_carrinho
		carrinho.testeAdicionarProdutoAoCarrinho();
		carrinho.testeRemoverProdutoDoCarrinho();

		// Teste_filtrar_e_classificar
		filtrar.testeFiltrarDeAaZ();
		filtrar.testeFiltrarDeZaA();
		filtrar.testeFiltrarPrecoBaixoParaAlto();
		filtrar.testeFiltrarPrecoAltoParaBaixo();
	*/
	}

}
