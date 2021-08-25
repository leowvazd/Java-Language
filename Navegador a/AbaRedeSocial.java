package navegador;

public class AbaRedeSocial extends AbaNavegador {

	public AbaRedeSocial() {
	}
	
	public void postar(String texto) {
		Navegador.adicionarNoHistorico("Post: "+texto);
		Navegador.qtdNoHistorico++;
	}
	
	public String getTipo() {
		this.tipo = "RedeSocial";
		return "RedeSocial";
	}
}
