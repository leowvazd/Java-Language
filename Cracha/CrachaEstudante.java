public class CrachaEstudante extends Cracha{

	private String curso;
	
	// Construtor sem parametros 
	public CrachaEstudante() {
		super();
	}

	// Função setCurso: armazena o nome do curso
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	// Função imprimir: imprime o nome e curso
	public void imprimir() {
		Impressao.imprimirLinha("ESTUDANTE");
		Impressao.imprimirLinha("Nome: " + super.nome);
		Impressao.imprimirLinha("Curso: " + curso);
	}		
}