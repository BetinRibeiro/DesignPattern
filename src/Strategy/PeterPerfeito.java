package Strategy;

import Strategy.Rodar.Tranquilamente;

public class PeterPerfeito extends Carro {
//a classe peter perfeito é configurado com o nome dele e um novo comportamento da forma de rodar
	public PeterPerfeito() {
		super("Peter Perfeito");
		setRodarBehavior(new Tranquilamente());
	}

}
