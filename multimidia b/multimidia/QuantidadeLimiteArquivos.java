package multimidia;

public class QuantidadeLimiteArquivos extends Exception {
	private static final long serialVersionUID = 1L;

	public QuantidadeLimiteArquivos() {
		super("Quantidade limite de arquivos foi atingida.");
	}

}
