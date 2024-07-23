package steps;

import pages.PageProducts;

public class ClassificarEFiltrarStep {

	PageProducts step = new PageProducts();
	
	
	public void testeFiltrarDeAaZ() {
		step.que_esteja_na_pagina_de_produtos();
		step.clicar_em_filtrar_e_classificar();
		step.escolher_a_filtragem_de_a_a_z();
		step.o_site_deve_atualizar_os_produtos_na_ordem_desejada();
		
	}
	
	public void testeFiltrarDeZaA()  {
		step.que_esteja_na_pagina_de_produtos();
		step.clicar_em_filtrar_e_classificar();
		step.escolher_a_filtragem_de_z_a_a();
		step.o_site_deve_atualizar_os_produtos_na_ordem_desejada();
		
	}
	
	public void testeFiltrarPrecoBaixoParaAlto() {
		step.que_esteja_na_pagina_de_produtos();
		step.clicar_em_filtrar_e_classificar();
		step.escolher_a_filtragem_de_preco_do_baixo_para_o_alto();
		step.o_site_deve_atualizar_os_produtos_na_ordem_desejada();
	}
	
	public void testeFiltrarPrecoAltoParaBaixo() {
		step.que_esteja_na_pagina_de_produtos();
		step.clicar_em_filtrar_e_classificar();
		step.escolher_a_filtragem_de_preco_do_alto_para_o_baixo();
		step.o_site_deve_atualizar_os_produtos_na_ordem_desejada();
	}
	
	
	
}
