public abstract class Cracha {
	
	// Variável pretected nome (para poder ser utilizada pelas classes derivadas) 
	protected String nome;
	
	// Construtor sem parâmetros 
	public Cracha() {

	}

	// Função setNome: altera o nome
	public void setNome(String nome) {
		this.nome = nome;
	}
		
	// Função imprimir: imprime o nome
	public abstract void imprimir();
}