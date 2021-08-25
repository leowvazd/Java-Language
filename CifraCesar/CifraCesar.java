public class CifraCesar implements Cifra{
	
	private int nShifts;

	public CifraCesar(int nShifts) {
		super();
		this.nShifts = nShifts;
	}
	
	public String cifrar(String mensagem) {
		String cifra = new String();
		
		// Para cada caractere na mensagem
		for(char c : mensagem.toCharArray()) {
			// Se o caractere não for um espaço	e for maiúsculo	
			if (c != ' ' && c <= 'Z') {
				// Acrescenta o shift e calcula módulo número de caracteres
				cifra += (char) (((c - 'A' + nShifts) % 26) + 'A');
			// Se o caractere não for um espaço e for minúsculo
			} else if(c != ' ' && c >= 'a') {
				// Acrescenta o shift e calcula módulo número de caracteres
				cifra += (char) (((c - 'a' + nShifts) % 26) + 'a');
			// Caso o caractere seja apenas um espaço
			} else {
				cifra += ' ';
			}
		}
		
		// Retorna a cifra
		return cifra;
	}
	
	public String decifrar(String mensagem) {
		String decifra = new String();
		
		// Para cada caractere na mensagem
		for(char c : mensagem.toCharArray()) {
			// Se o caractere não for um espaço			
			if (c != ' ' && c <= 'Z') {
				// Subtrai o shift e calcula módulo número de caracteres
				decifra += (char) (((c - 'A' - nShifts) % 26) + 'A');
			// Se o caractere não for um espaço e for minúsculo
			} else if(c != ' ' && c >= 'a') {
				// Subtrai o shift e calcula módulo número de caracteres
				decifra += (char) (((c - 'a' - nShifts) % 26) + 'a');
			// Caso o caractere seja apenas um espaço
			} else {
				decifra += ' ';
			}
		}
		
		// Retorna a decifra
		return decifra;
	}	
}
