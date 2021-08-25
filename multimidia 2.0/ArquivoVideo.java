package multimidia;

public class ArquivoVideo extends ArquivoMultimidia {

	private int largura;
	private int altura;
	
	public ArquivoVideo(String nomeArquivo, int largura, int altura) {
		super(nomeArquivo);
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public String toString() {
		return String.format("Video: %s (%d x %d)", getNomeArquivo(), altura, largura);
	}
}
