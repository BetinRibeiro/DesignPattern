package Decorator;

public class NoiteFeliz {
	
	private ArvoreNatal arvore;
	
	public NoiteFeliz() {
		arvore = new Pinheiro();
		//Essa é a nossa base
		arvore = new ArvoreAzul();
		//essas são as decorações - não existem limites para as decorações
		arvore= new Estrela(arvore);
		
		arvore= new Guirlanda(arvore);
		cancao(arvore);
	}
	
	public void cancao(ArvoreNatal arvoreNatal) {
		arvoreNatal.beleza();
	}

}
