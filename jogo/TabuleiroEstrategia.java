package jogo;

public class TabuleiroEstrategia extends Tabuleiro {
	
	private EstrategiaJogo jogador1;
	private EstrategiaJogo jogador2;
	
	public void setStrategyJogador1(EstrategiaJogo jogador1) {
		this.jogador1 = jogador1;
	}
	
	public void setStrategyJogador2(EstrategiaJogo jogador2) {
		this.jogador2 = jogador2;
	}
	
	public void jogarPartida() {
		
		while(true) {
			int[] coords1 = jogador1.getProximaJogada(getTabuleiro(), 'X');
			jogar('X', coords1[0], coords1[1]);
			
			if(getJogadorVencedor() != '.') {
				break;
			}
			
			int[] coords2 = jogador2.getProximaJogada(getTabuleiro(), 'O');
			jogar('O', coords2[0], coords2[1]);
			
			if(getJogadorVencedor() != '.') {
				break;
			}
			
		}
	}
}