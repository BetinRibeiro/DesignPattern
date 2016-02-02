package Composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Caixa extends Pacote {

	private ArrayList<Pacote> itens;
	private String nome;

	public Caixa(String nome) {
		itens = new ArrayList<>();
		this.nome = nome;
	}

	@Override
	public void empacotar(Pacote pacote) {
		itens.add(pacote);
	}

	@Override
	public void desempacotar(Pacote pacote) {
		itens.remove(pacote);
	}

	@Override
	public Pacote pegar(int posicao) {
		return itens.get(posicao);

	}

	@Override
	public double getPreco() {
		double total =0;
		for (Pacote pacote : itens) {
			total+=pacote.getPreco();
		}
		return total;
	}

	@Override
	public void relatorios() {
		
		System.out.println("Caixa "+nome+"[Valor: "+getPreco()+"]");
		
		for (Pacote pacote : itens) {
			pacote.relatorios();
		}
	}

	@Override
	public Iterator<Pacote> createIterator() {
		return new CompositeIterator(itens.iterator());
	}
	
	
	
}