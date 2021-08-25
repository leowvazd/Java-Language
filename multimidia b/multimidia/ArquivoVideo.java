package multimidia;

public class ArquivoVideo extends ArquivoMultimidia {

	private int largura;
	private int altura;
	
	public ArquivoVideo(String nomeArquivo, int tamanho, int largura, int altura) {
		super(nomeArquivo, tamanho);
		this.largura = largura;
		this.altura = altura;
	}
	
	public int getLargura() {
		return largura;
	}
	
	public int getAltura() {
		return altura;
	}
	
	@Override
	public String toString() {
		return String.format("Video: %s (%d)", getNomeArquivo(), getTamanhoArquivo());
	}
}
