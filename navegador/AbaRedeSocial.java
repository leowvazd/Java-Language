package navegador;

public class AbaRedeSocial extends AbaNavegador{

	private String[] historico = new String[50];
	private int contadorHistorico;
	
	public AbaRedeSocial(int tipo, String titulo) {
		super(tipo, titulo);
	}
	
	//Registra uma postagem no histórico
	public void postar(String texto) {
		atualizaHistorico(texto);
		
	}

	public String[] getHistorico() {
		return historico;
	}
	
	public int getContadorHistorico() {
		return contadorHistorico;
	}

	//Retorna o tipo da aba
	@Override
	public String getTipo() {
		return this.geraTipo();
	}

	@Override
	protected void atualizaHistorico(String texto) {
		if(contadorHistorico < historico.length) {
			this.historico[contadorHistorico] = "Post: " + texto;
			contadorHistorico++;
		} else {
			throw new RuntimeException("Histórico cheio");
		}
		
	}
}
