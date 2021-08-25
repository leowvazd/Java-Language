public class CrachaFuncionario extends Cracha{

	private String cargo;
	private int m, a;
	
	// Construtor sem parametros 
	public CrachaFuncionario() {
		super();
	}

	// Função setCargo: armazena o cargo
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	// Função setCurso: armazena o mes e ano de admissao
	public void setDataAdmissao(int m, int a) {
		this.m = m;
		this.a = a;
	}
	
	// Função imprimir: imprime o nome, cargo e data de admissao
	public void imprimir() {
		Impressao.imprimirLinha("FUNCIONARIO");
		Impressao.imprimirLinha("Nome: " + super.nome);
		Impressao.imprimirLinha("Cargo: " + cargo);
		Impressao.imprimirLinha("Admissao: " + m + "/" + a);
	}
}
