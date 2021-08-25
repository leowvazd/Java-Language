package navegador;

public abstract class AbaNavegador {
	protected String titulo = "";
	protected String tipo;
	
	public AbaNavegador() {}
	
	public String getTitulo() {
		return this.titulo;
	}
	public abstract String getTipo();

}
