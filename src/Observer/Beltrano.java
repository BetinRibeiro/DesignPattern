package Observer;

//observador - recebe a fofoca e se comporta de um modo bem especifico
public class Beltrano implements Vizinho {

	private Fofoqueiro fulano;

	public Beltrano(Fofoqueiro fulano) {
		this.fulano = fulano;
		fulano.fazerAmizade(this);
	}

	@Override
	public void coxixar(String fofoca) {
		int res = fofoca.indexOf("Beltrano");
		if (res > 0) {
			fulano.entrigar(this);
			System.out.println("Beltrano: Quero mais amizade depois de uma dessas mais não");
		} else {
			System.out.println("Beltrano: tem certeza disso... rapaz..."+fofoca);
		}

	}

}
