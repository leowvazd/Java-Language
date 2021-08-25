package dispositivos;

public class Gerenciador {

	private DispositivoInteligente[] getDispositivos = new DispositivoInteligente[10];
	
	public Gerenciador() {
	}
	
	private int posicao = 0;
	public void adicionarDispositivo(DispositivoInteligente d) {
		if(posicao < getDispositivos.length) {
			getDispositivos[posicao] = d;
			posicao++;
		}
	}
	
	public void ligarTodosDispositivos() {
		for (DispositivoInteligente dispositivoInteligente : getDispositivos) {
			if(dispositivoInteligente != null)
			dispositivoInteligente.ligar();
		}
	}
	
	public void desligarTodosDispositivos() {
		for (DispositivoInteligente dispositivoInteligente : getDispositivos) {
			if(dispositivoInteligente != null)
			dispositivoInteligente.desligar();
		}
	}
	
	public DispositivoInteligente[] getDispositivos() {
		return getDispositivos;
	}
}
