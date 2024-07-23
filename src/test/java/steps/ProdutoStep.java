package steps;

import pages.PageProducts;

public class ProdutoStep {

	PageProducts step = new PageProducts ();
	
	public void testeSelecionarProduto() {
		
		step.que_esteja_na_pagina_de_produtos();
		step.selecionar_o_produto_desejado();
		step.o_site_redireciona_para_a_pagina_com_detalhes_do_produto();
	}
	

	
}
