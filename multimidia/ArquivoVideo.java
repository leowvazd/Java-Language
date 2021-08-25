package multimidia;

public class ArquivoVideo extends ArquivoMultimidia {

	private String nomeArquivo;
	private int largura;
	private int altura;
	
	public ArquivoVideo(String nomeArquivo, int largura, int altura) {
		super(nomeArquivo);
		this.nomeArquivo = nomeArquivo;
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		String saida = String.format("Video: %s (%d x %d)", nomeArquivo, largura, altura);
		return saida;
	}
	
	

	
}
