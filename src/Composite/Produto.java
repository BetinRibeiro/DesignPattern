package Composite;

public class Produto extends Pacote {
	
	private String nome;
	private double preco;
	private boolean salgado;
	
	
	
	
	public Produto(String nome, double preco, boolean salgado) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.salgado = salgado;
	}




	@Override
	public double getPreco() {
		return this.preco;
	}




	@Override
	public void relatorios() {
		System.out.println("Produto nome: "+nome+" |  [Valor: "+preco+"]");
	}




	@Override
	public boolean isSalgado() {
		return salgado;
	}
	
	
	
	
}
