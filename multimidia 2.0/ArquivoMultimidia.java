package multimidia;

public abstract class ArquivoMultimidia {
	
	private String nomeArquivo;
	
	public ArquivoMultimidia(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
}
