package navegador;

public class AbaBuscador extends AbaNavegador {
	public AbaBuscador() {}
	
	public void buscar(String expressao) {
		Navegador.adicionarNoHistorico("Busca: "+expressao);
		Navegador.qtdNoHistorico++;
	}
	
	public String getTipo() {
		this.tipo = "Buscador";
		return "Buscador";
	}
}
