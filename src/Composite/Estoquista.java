package Composite;

import java.util.Iterator;

public class Estoquista {

	// fara uma relação geral do que ele recebeu
	public void relatoriosGeral(Pacote pacote) {
		pacote.relatorios();

	}

	// recebe um pacote e retorno o preco
	public void totalPreco(Pacote pacote) {
		System.out.println("Valor total: " + pacote.getPreco());

	}

	public void totalSalgados(Pacote pacote) {
		Iterator<Pacote> i = pacote.createIterator();
		int total = 0;
		while (i.hasNext()) {
			Pacote p = i.next();
			try {
				if (p.isSalgado()) {
					total++;
				}

			} catch (UnsupportedOperationException e) {
//				e.printStackTrace();
			}catch (Exception r) {
				r.printStackTrace();
			}

		}
		System.out.println("Total de salgados do estoque: " + total);
	}

}
