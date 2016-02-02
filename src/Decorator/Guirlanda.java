package Decorator;

public class Guirlanda extends Decoracao {
	private ArvoreNatal arvore;
	
	public Guirlanda(ArvoreNatal arvore) {
		this.arvore=arvore;
	}

	@Override
	public void beleza() {
		arvore.beleza();
		System.out.println("Essa é mais bonita");
	}

}
