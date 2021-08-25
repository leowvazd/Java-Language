package jogo;

public class EstrategiaA implements EstrategiaJogo {
	
	
	
	@Override
	public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) {
		
		int[] coords = new int[2];
		
		for (int i = 0; i < dadosTabuleiro.length; i++) {
			for (int j = 0; j < dadosTabuleiro.length; j++) {
				if(dadosTabuleiro[i][j] == '.') {
					coords[0] = i;
					coords[1] = j;
					return coords;
				}
			}
		}
		return coords;
	}
}
