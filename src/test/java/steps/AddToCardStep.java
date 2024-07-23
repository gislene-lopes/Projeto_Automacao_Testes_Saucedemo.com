package steps;

import pages.PageProducts;

public class AddToCardStep {

	PageProducts step = new PageProducts();

	public void TesteAdicionarProdutoAoCarrinho() {
		step.que_esteja_na_pagina_do_produto_desejado();
		step.clicar_em_add_to_card();
		step.o_produto_deve_ser_adicionado_ao_carrinho_com_sucesso();
	}

	public void TesteRemoverProdutoDoCarrinho() {
		step.que_esteja_na_pagina_do_produto_desejado();
		step.clicar_em_remove();
		step.o_produto_deve_ser_removido_do_carrinho();
	}

}
