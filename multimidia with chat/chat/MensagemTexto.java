package chat;

class MensagemTexto extends Mensagem {

	private String texto;

	public MensagemTexto(String texto) {
		this.texto = texto;
	}

	@Override
	public String getRepresentacao() {
		if (isResponde()) {
			return String.format("%s RESPOSTA A %s (likes=%d)", texto, getRepresentacaoPergunta(), getLikes());
		}
		return String.format("%s (likes=%d)", texto, getLikes());
	}

	public String getTexto() {
		return texto;
	}
}
