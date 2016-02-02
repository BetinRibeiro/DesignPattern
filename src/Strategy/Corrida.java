package Strategy;

import Strategy.Rodar.Acelerando;

public class Corrida {
	
	private Carro pos1;
//	private Carro pos2;
	
	public Corrida() {
		pos1 = new PeterPerfeito();
	}
	//ele vai mudar o comportamento na ultima volta, no meio da execução
	public void largada() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Volta "+(i+1)+"#");
			System.out.println(pos1.getPiloto()+" : ");
			if (i==2) {
				pos1.setRodarBehavior(new Acelerando());
			}
			pos1.rodar();
		}
	}

}
