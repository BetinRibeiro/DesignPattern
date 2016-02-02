package Composite;

import java.util.Iterator;

public class NullIterator implements Iterator<Pacote> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Pacote next() {
		return null;
	}

}
