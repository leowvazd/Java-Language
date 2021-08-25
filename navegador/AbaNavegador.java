package navegador;

public abstract class AbaNavegador {

	private int tipo;
	private int numero;
	protected String titulo;
	private boolean aberta;

	public AbaNavegador(int tipo, String titulo) {
		super();
		this.tipo = tipo;
		this.titulo = titulo;
	}
	
	//Retorna tipo da aba (Busca ou rede social)
	public abstract String getTipo();
	
	protected String geraTipo() {
		String tipo = this.getClass().getName().replace("navegador.Aba", "");
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}



	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	//Retorna o título da aba
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "[" + tipo + "|" + titulo + "]";
	}
	
	public boolean isAberta() {
		return this.aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	protected abstract void atualizaHistorico(String acao);
}
