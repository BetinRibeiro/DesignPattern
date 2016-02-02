package Observer;

//observador - recebe a fofoca e se comporta de um modo bem especifico
public class Cicrano implements Vizinho{

	private Fofoqueiro fulano;

	public Cicrano(Fofoqueiro fulano) {
		this.fulano = fulano;
		fulano.fazerAmizade(this);
	}

	@Override
	public void coxixar(String fofoca) {
		int res = fofoca.indexOf("Cicrano");
		if (res > 0) {
			fulano.entrigar(this);
			System.out.println("Cicrano: Quero mais amizade depois de uma dessas mais não");
		} else {
			System.out.println("Cicrano: Bagaça da porra!... deus me livre..."+fofoca);
		}

	}
}
