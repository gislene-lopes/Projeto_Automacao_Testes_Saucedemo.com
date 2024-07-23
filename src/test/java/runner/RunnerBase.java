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
		
		//TesteOK
		checkout.testeCheckoutComDadosValidos();
		checkout.testeCheckoutComDadosInvalidos();
		checkout.testeCheckoutComDadosEmBranco();
		checkout.testeFinalizandoACompra();
		
		
		/*
		// TesteOk
		login.testeLoginPositivo();
		login.testeLoginNegativoDadosEmBranco();
		login.testeLoginNegativoDadosInvalidos();

		// TesteOk
		produto.TesteSelecionarProduto();

		// TesteOK
		carrinho.TesteAdicionarProdutoAoCarrinho();
		carrinho.TesteRemoverProdutoDoCarrinho();

		// TestOK
		filtrar.TesteFiltrarDeAaZ();
		filtrar.TesteFiltrarDeZaA();
		filtrar.TesteFiltrarPrecoBaixoParaAlto();
		filtrar.TesteFiltrarPrecoAltoParaBaixo();
	*/
	}

}
