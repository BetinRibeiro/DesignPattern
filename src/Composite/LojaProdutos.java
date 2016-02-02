package Composite;

public class LojaProdutos {

	private Pacote estoque;

	private Estoquista funcionario;

	public LojaProdutos() {
		estoque = new Caixa("Estoque");
		Produto p;
		Caixa c;

		c = new Caixa("Preto 01");

		p = new Produto("Amendoim", 1.5, true);
		c.empacotar(p);

		p = new Produto("Amendoim vermelho", 16.5, false);
		c.empacotar(p);

		p = new Produto("Fécula", 14.5, false);
		c.empacotar(p);

		p = new Produto("Feijão", 21.5, true);
		c.empacotar(p);

		estoque.empacotar(c);

		c = new Caixa("Amarelo 05");

		p = new Produto("Arroz", 1.5, true);
		c.empacotar(p);

		p = new Produto("Agua mineral", 16.5, false);
		c.empacotar(p);

		p = new Produto("Chocolate", 14.5, false);
		c.empacotar(p);

		p = new Produto("Pão", 21.5, true);
		c.empacotar(p);

		estoque.empacotar(c);

		funcionario = new Estoquista();
		
		funcionario.relatoriosGeral(estoque);
		funcionario.totalPreco(estoque);
		
		funcionario.totalSalgados(estoque);
	}

}
