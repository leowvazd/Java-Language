package multimidia;

public class IndiceArquivoInvalido extends Exception {
	private static final long serialVersionUID = 1L;

	public IndiceArquivoInvalido(int i) {
		super(String.format("Indice de arquivo invalido = %d", i));
	}
}
