package Composite;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator<Pacote> {

	private Stack<Iterator<Pacote>> pilha;

	public CompositeIterator(Iterator<Pacote> iterator) {
		pilha = new Stack<>();
		pilha.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (pilha.isEmpty())
			return false;

		Iterator<Pacote> i = pilha.peek();

		if (i.hasNext())
			return true;

		pilha.pop();

		return hasNext();
	}

	@Override
	public Pacote next() {
		if (hasNext()) {
			Iterator<Pacote> i = pilha.peek();
			Pacote p = i.next();
			if (p instanceof Caixa)
				pilha.push(p.createIterator());
			return p;

		}
		return null;
	}

}
