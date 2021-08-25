package navegador;

public class AbaBuscador extends AbaNavegador{

	private String[] historico = new String[50];
	private int contadorHistorico;
	
	public AbaBuscador(int tipo, String titulo) {
		super(tipo, titulo);
	}
	
	//Registra uma busca no histórico
	public void buscar(String expressao) {
		atualizaHistorico(expressao);
	}

	public String[] getHistorico() {
		return historico;
	}
	
	public int getContadorHistorico() {
		return contadorHistorico;
	}

	//Retorna tipo da aba
	@Override
	public String getTipo() {
		return this.geraTipo();
	}

	@Override
	protected void atualizaHistorico(String expressao) {
		if(contadorHistorico < historico.length) {
			this.historico[contadorHistorico] = "Busca: " + expressao;
			contadorHistorico++;
		} else {
			throw new RuntimeException("Histórico cheio");
		}
		
	}

}
