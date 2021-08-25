/*public ImpressaoLimiteLargura(int largura): construtor que armazena a largura máxima de linha passada no parâmetro largura.
void imprimir(Relatorio r): imprime o texto considerando que há uma largura limite para impressão, ou seja, nenhuma linha impressa pode passar de um determinado número caracteres. Ao realizar esse tipo de impressão, algumas regras devem ser observadas:
as palavras não podem ser separadas. Portanto, se não tiver espaço disponível para incluir uma palavra em uma linha, ela deverá ser incluída na próxima. Por exemplo, para o texto "Frase teste" e largura de linha 8, a divisão seria em duas linhas "Frase" e "teste" (não há espaço na primeira linha para incluir "Frase teste". Se a largura de linha for 11, apenas uma linha é suficiente.
datas não podem ser separadas: a regra anterior se aplica a datas também (e.g. 10/10/1000).
toda linha deve iniciar com uma letra, ou seja, nenhuma linha deve iniciar com o caractere espaço ou com pontuação (ponto, vírgula, etc). Se algum sinal de pontuação ficar exatamente após uma quebra de linha, a palavra que precede o sinal deve ser passada para a próxima linha, de forma que nenhuma linha inicie com pontuação. Por exemplo, para o texto "Neste teste, a frase possui pontuacao." e largura de linha 11, a divisão seria em cinco linhas: "Neste", "teste, a", "frase", "possui", "pontuacao."
um caractere espaço que fique exatamente após uma quebra de linha deve ser suprimido, de forma que a próxima linha inicie com uma palavra (e não com um caractere espaço). Por exemplo, para o texto "Texto para teste ABCD" e largura 10, a divisão seria em duas linhas: "Texto para" e "teste ABCD".

*/


package relatorio;


public class ImpressaoLimiteLargura implements PluginImpressao {
	int limite, tamanhoProxPalavra = 0, tamanhoPalavraAtual = 0;
	String[] linhas;
	
	public ImpressaoLimiteLargura(int limite) {
		this.limite = limite;
	}

	@Override
	public void imprimir(Relatorio r) {

        String texto = r.getTexto();
        
		linhas = new String[texto.length()];
		
		for(int i = 0; i < linhas.length; i++) linhas[i] = "";
		
		
		for(int i = 0, j = 0; i < texto.length(); i++) {
			if(texto.charAt(i) != ' ') {
			    linhas[j] += texto.charAt(i);
			    tamanhoPalavraAtual++;
			}
			if(texto.charAt(i) == ' ') {
				for(int k = i+1;k < texto.length() && texto.charAt(k) != ' ' ; k++) tamanhoProxPalavra++;
				if(tamanhoProxPalavra + tamanhoPalavraAtual + 1 > limite) {
					j++;
					tamanhoPalavraAtual = 0;
				}
				else linhas[j] += texto.charAt(i);
				tamanhoProxPalavra = 0;
			}
		}
		tamanhoProxPalavra = 0;
		tamanhoPalavraAtual = 0;
		
		for(int i = 0; linhas[i] != null && linhas[i] != "" && i < linhas.length; i++) {
			Impressao.imprimirLinha(linhas[i]);
		}
	}

}
