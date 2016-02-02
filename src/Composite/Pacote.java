package Composite;

import java.util.Iterator;


public abstract class Pacote {

	// só vai existir nas caixas
	public void empacotar(Pacote pacote) {
		throw new UnsupportedOperationException();
	}

	// só vai existir nas caixas
	public void desempacotar(Pacote pacote) {
		throw new UnsupportedOperationException();
	}

	// só vai existir nas caixas
	public Pacote pegar(int posicao) {
		throw new UnsupportedOperationException();
	}

	// vai existir nas caixas e nos produto
	public double getPreco() {
		throw new UnsupportedOperationException();
	}

	// vai existir nas caixas e nos produto
	public void relatorios() {
		throw new UnsupportedOperationException();
	}

	// só vai existir no produto
	public boolean isSalgado() {
		throw new UnsupportedOperationException();
	}

	// para poder contar todos os itens
	public Iterator<Pacote> createIterator() {
		return new NullIterator();
	}

}
