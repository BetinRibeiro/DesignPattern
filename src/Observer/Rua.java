package Observer;

import java.util.Random;
//local aonde acontece 
public class Rua implements Runnable {

	//possui basicamente fofocas e o plantoneiro que é o fofoqueiro
	private Fofoqueiro fulano;

	private String[] fofocas = { "Cirlandia chegou de madrugada com outra moça",
			"Hildomar é corno Beltrano paga a mulher dele", "Fabia fio morar o caberá do wal",
			"Francisco saiu com duas mulheres outro dia" };

	//essas classes são para acontecer de forma desordenada e sumultanea
	private Thread th;
	//essa é só pra pagar numenos aleatorios
	private Random momento;

	public Rua() {
		//instanciamos o fofoqueiro e dois observadores
		this.fulano = new Fulano();
		new Beltrano(fulano);
		new Cicrano(fulano);

		momento = new Random();
		th = new Thread(this);
		th.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				int a=momento.nextInt(3);
				Thread.sleep(a*1000);
				((Fulano) fulano).setFofoca(fofocas[a]);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
