package dispositivos;

abstract class DispositivoInteligente {

	private boolean estado;
	
	public DispositivoInteligente() {
	}
	
	public void ligar() {
		this.estado = true;
	}
	
	public void desligar() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
}
