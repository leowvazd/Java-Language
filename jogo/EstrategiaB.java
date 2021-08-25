package jogo;

public class EstrategiaB implements EstrategiaJogo {

	@Override
	public int[] getProximaJogada(char[][] dadosTabuleiro, char jogador) {
		
		int[] coords = new int[2];
		
		if(dadosTabuleiro[1][1] == '.') {
			coords[0] = 1;
			coords[1] = 1;
			return coords;
		}
		
		if(dadosTabuleiro[0][0] == '.') {
			coords[0] = 0;
			coords[1] = 0;
			return coords;
		}
		
		if(dadosTabuleiro[0][2] == '.') {
			coords[0] = 0;
			coords[1] = 2;
			return coords;
		}
		
		if(dadosTabuleiro[2][0] == '.') {
			coords[0] = 2;
			coords[1] = 0;
			return coords;
		}
		
		if(dadosTabuleiro[2][2] == '.') {
			coords[0] = 2;
			coords[1] = 2;
			return coords;
		}
		
		if(dadosTabuleiro[0][1] == '.') {
			coords[0] = 0;
			coords[1] = 1;
			return coords;
		}
		
		if(dadosTabuleiro[1][0] == '.') {
			coords[0] = 1;
			coords[1] = 0;
			return coords;
		}
		
		if(dadosTabuleiro[1][2] == '.') {
			coords[0] = 1;
			coords[1] = 2;
			return coords;
		}
		
		if(dadosTabuleiro[2][1] == '.') {
			coords[0] = 2;
			coords[1] = 1;
			return coords;
		}
		
		return coords;
	}

	
}
