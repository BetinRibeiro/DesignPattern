package Decorator;

public class Estrela extends Decoracao {
	
	private ArvoreNatal arvore;
	
	public Estrela(ArvoreNatal arvore) {
		this.arvore=arvore;
	}

	@Override
	public void beleza() {
		arvore.beleza();
		System.out.println("complemento do metodo");

	}

}
