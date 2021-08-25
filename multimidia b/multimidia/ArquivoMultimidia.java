package multimidia;

public abstract class ArquivoMultimidia {
	
	private String nomeArquivo;
	private int tamanhoArquivo;
	
	public ArquivoMultimidia(String nomeArquivo, int tamanho) {
		this.nomeArquivo = nomeArquivo;
		this.tamanhoArquivo = tamanho;
	}
	
	public String getNomeArquivo() {
		return nomeArquivo;
	}
	
	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}
	
	public int getTamanhoArquivo() {
		return tamanhoArquivo;
	}
}
