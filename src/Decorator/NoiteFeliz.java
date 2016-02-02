package Decorator;

public class NoiteFeliz {
	
	private ArvoreNatal arvore;
	
	public NoiteFeliz() {
		arvore = new Pinheiro();
		//Essa � a nossa base
		arvore = new ArvoreAzul();
		//essas s�o as decora��es - n�o existem limites para as decora��es
		arvore= new Estrela(arvore);
		
		arvore= new Guirlanda(arvore);
		cancao(arvore);
	}
	
	public void cancao(ArvoreNatal arvoreNatal) {
		arvoreNatal.beleza();
	}

}
