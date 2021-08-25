package chat;

class MensagemImagem extends Mensagem {

	private String arquivoImagem;
	private int largura;
	private int altura;	
	
	public MensagemImagem(String arquivoImagem, int largura, int altura) {
		this.arquivoImagem = arquivoImagem;
		this.largura = largura;
		this.altura = altura;
	}
	
	@Override
	public String getRepresentacao() {
		if (isResponde()) {
			return String.format("%s %dX%d RESPOSTA A %s (likes=%d)", arquivoImagem, largura, altura, getRepresentacaoPergunta(), getLikes());
		}
		return String.format("%s %dX%d (likes=%d)", arquivoImagem, largura, altura, getLikes());
	}

}
