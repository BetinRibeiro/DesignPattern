package Strategy;

import Strategy.Rodar.RodarBehavior;
//nesse caso sera um carro generico
//mesma coisa de programar para interfaces
public abstract class Carro {

	private RodarBehavior rodarBehavior;
	private String piloto;
	
	
	public Carro(String piloto) {
		this.piloto = piloto;
	}

	public RodarBehavior getRodarBehavior() {
		return rodarBehavior;
	}
	// com esse metodo podemos trocar de maneira dinamica a implementação do
	// metodo rodar que existem em todos os carros
	
	public void rodar() {
		rodarBehavior.rodar();
	}

	public void setRodarBehavior(RodarBehavior rodarBehavior) {
		this.rodarBehavior = rodarBehavior;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

}
