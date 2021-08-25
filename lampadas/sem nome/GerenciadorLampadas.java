import dispositivos.*;

public class GerenciadorLampadas {

	private LampadaInteligente[] lampadas;
	
	public void adicionarLampada() {
		LampadaInteligente lampada = new LampadaInteligente();
		if(lampadas == null) {
			lampadas = new LampadaInteligente[1];
			lampadas[0] = lampada;
		} else if (lampadas.length < 10) {
			LampadaInteligente[] temp = new LampadaInteligente[lampadas.length + 1];
			for (int i = 0; i < lampadas.length; i++) {
				temp[i] = lampadas[i];
			}
			temp[lampadas.length] = lampada;
			
			lampadas = temp;
		}
	}
	
	public void ligarLampada(int indiceLampada) throws LampadaEstaLigada {
		if(lampadas[indiceLampada].getEstado() == false) {
			lampadas[indiceLampada].ligar();
		} else {
			throw new LampadaEstaLigada();
		}
	}
	
	public void desligarLampada(int indiceLampada) throws LampadaEstaDesligada {
		if(lampadas[indiceLampada].getEstado() == true) {
			lampadas[indiceLampada].desligar();;
		} else {
			throw new LampadaEstaDesligada();
		}
	}
	
	public LampadaInteligente[] getLampadas() {
		return lampadas;
	}
}
