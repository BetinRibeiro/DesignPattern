package Observer;

import java.util.ArrayList;
import java.util.List;

//observado - setamos a fofoca, criamos a classe, registramos, desfazemos registros,notificamos
public class Fulano implements Fofoqueiro {

	List<Vizinho> pareceiros;
	private String fofoca;

	public void setFofoca(String fofoca) {
		this.fofoca = fofoca;
		fofocar();
	}

	public Fulano() {
		this.pareceiros = new ArrayList<Vizinho>();
	}

	@Override
	public void fazerAmizade(Vizinho v) {
		pareceiros.add(v);

	}

	@Override
	public void entrigar(Vizinho v) {
		pareceiros.remove(v);

	}

	@Override
	public void fofocar() {
		for (Vizinho vizinho : pareceiros) {
			vizinho.coxixar(fofoca);
		}

	}

}
