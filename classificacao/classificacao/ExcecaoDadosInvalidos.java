package classificacao;

class ExcecaoDadosInvalidos extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int qtdAtributosTreinamento;
	private int qtdAtributosPredizer;
	
	public ExcecaoDadosInvalidos(int qtdAtributosTreinamento, int qtdAtributosPredizer) {
		super("Erro: A quantidade de atributos informada está diferente da quantidade"
				+ " de atributos do exemplo.\n Quantidades ->"
				+ " qtdAtributosTreinamento: " + qtdAtributosTreinamento + ""
				+ " | qtdAtributosPredizer: " + qtdAtributosPredizer);
		this.qtdAtributosTreinamento = qtdAtributosTreinamento;
	}
	
	public int getQtdAtributosTreinamento() {
		return this.qtdAtributosTreinamento;
		
	}
	
	public int getQtdAtributosPredizer() {
		return this.qtdAtributosPredizer;
	}
}
