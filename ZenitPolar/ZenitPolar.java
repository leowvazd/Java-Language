public class ZenitPolar implements Cifra{

	public ZenitPolar() {
		super();
	}

	public String cifrar(String mensagem) {
		String cifra = new String();
		
		// Para cada caractere na mensagem
		for(char c : mensagem.toCharArray()) {
			// Verifica se é uma das letras que vamos trocar e faz a troca
			switch(c) {
			case 'z' : cifra += 'p';
				break;
			case 'Z' : cifra += 'P';
				break;
			case 'p' : cifra += 'z';
				break;
			case 'P' : cifra += 'Z';
				break;
			case 'e' : cifra += 'o';
				break;
			case 'E' : cifra += 'O';
				break;
			case 'o' : cifra += 'e';
				break;
			case 'O' : cifra += 'E';
				break;
			case 'n' : cifra += 'l';
				break;
			case 'N' : cifra += 'L';
				break;
			case 'l' : cifra += 'n';
				break;
			case 'L' : cifra += 'N';
				break;
			case 'i' : cifra += 'a';
				break;
			case 'I' : cifra += 'A';
				break;
			case 'a' : cifra += 'i';
				break;
			case 'A' : cifra += 'I';
				break;
			case 't' : cifra += 'r';
				break;
			case 'T' : cifra += 'R';
				break;
			case 'r' : cifra += 't';
				break;
			case 'R' : cifra += 'T';
				break;
			// Caso não seja, só copia o caractere
			default:
				cifra += c;
			}
		}
		
		// Retorna a cifra
		return cifra;
	}
	
	// Para decrifrar, o processor é o mesmo de cifrar
	public String decifrar(String mensagem) {
		return cifrar(mensagem);
	}
}
