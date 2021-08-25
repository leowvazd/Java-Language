package chat;

public class ListaMensagens {

	private Mensagem[] mensagens;
	
	public ListaMensagens() {
	}
	
	public void adicionarMensagem(Mensagem mensagem) {
		if(mensagens == null) {
			mensagens = new Mensagem[1];
			mensagens[0] = mensagem;
		} else {
			Mensagem[] temp = new Mensagem[mensagens.length + 1];
			for (int i = 0; i < temp.length - 1; i++) {
				temp[i] = mensagens[i];
			}
			temp[temp.length - 1] = mensagem;
			mensagens = temp;
		}
	}
	
	public void responderMensagem(int indiceMensagemOriginal, Mensagem resposta) {
		if(mensagens != null) {
			mensagens[indiceMensagemOriginal].responder(resposta);
		}
	}
	
	public Mensagem[] getMensagens() {
		if(mensagens != null) {
			return mensagens;
		}
		return null;
	}
	
	public String[] getMensagensString() {
		String[] array = new String[mensagens.length];
		for (int i = 0; i < array.length; i++) {
			array[i] = mensagens[i].getRepresentacao();
		}
		return array;
	}
	
	public void like(int indiceMensagem) {
		mensagens[indiceMensagem].like();
	}
}
