package multimidia;

public class ArquivoAudio extends ArquivoMultimidia {

	private String nomeArquivo;
	private boolean audioHD;
	
	public ArquivoAudio(String nomeArquivo, boolean audioHD) {
		super(nomeArquivo);
		this.nomeArquivo = nomeArquivo;
		this.audioHD = audioHD;
	}
	
	@Override
	public String toString() {
		String saida = String.format("Audio: %s (HD = %s)", nomeArquivo, audioHD);
		return saida;
	}
}
