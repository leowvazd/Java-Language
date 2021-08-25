package chat;

public abstract class Mensagem {
	
	private int likes;
	private Mensagem resposta;
	private String representacaoPergunta;
	private boolean responde;
	
	public void like() {
		likes++;
	}
	
	public void responder(Mensagem resposta) {
		String[] arrayRepresentacao = getRepresentacao().split(" \\(");
		resposta.representacaoPergunta = arrayRepresentacao[0];
		resposta.responde = true;
		this.resposta = resposta;
	}
	
	public abstract String getRepresentacao();
	
	public int getLikes() {
		return likes;
	}
	
	public Mensagem getResposta() {
		return resposta;
	}
	
	public boolean isResponde() {
		return responde;
	}
	
	public String getRepresentacaoPergunta() {
		return representacaoPergunta;
	}
}
