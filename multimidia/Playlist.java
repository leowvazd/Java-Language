package multimidia;

public class Playlist {

	private ArquivoMultimidia[] arquivos;
	private int contaArquivos;
	
	//inicializa a playlist sem nenhum arquivo. Uma playlist pode ter no máximo 100 arquivos
	public Playlist() {
		this.arquivos = new ArquivoMultimidia[100];
	}
	
	//adiciona um arquivo multimídia no final da lista de arquivos
	public void adicionarItem(ArquivoMultimidia arquivo) {
		arquivos[contaArquivos] = arquivo;
		contaArquivos++;
	}
	
	//altera o nome de um arquivo na lista de arquivos da playlist
	public void renomearItem(int indiceArquivo, String novoNomeArquivo) {
		arquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo);
	}
	
	//move o arquivo especificado para o início da lista.
	public void moverParaInicio(int indiceArquivo) {
		
		for(int i = contaArquivos; i >= 0; i--) {
			arquivos[i + 1] = arquivos[i];
		}
		
		arquivos[0] = arquivos[indiceArquivo + 1];
		
		for(int i = indiceArquivo + 1; i < contaArquivos + 1; i++) {
			arquivos[i] = arquivos[i + 1];
		}
		
		arquivos[contaArquivos + 1] = null;
		
	}
	
	//retorna um vetor de String com os nomes dos arquivos na playlist
	public String[] listarArquivos() {
		String[] lista = new String[contaArquivos];
		for (int i = 0; i < contaArquivos; i++) {
			lista[i] = arquivos[i].getNomeArquivo();
		}
		
		return lista;
	}
	
	//sobrescreve o método clone de Object. Esse método 
	//deve realizar uma cópia profunda do objeto Playlist.
	//Nessa cópia profunda, inclusive as instâncias dos
	//arquivos devem ser copiadas na nova instância retornada
	@Override
	public Playlist clone() {
		Playlist playlist = new Playlist();
		
		for (int i = 0; i < contaArquivos; i++) {
			playlist.contaArquivos = this.contaArquivos;
			playlist.arquivos[i] = this.arquivos[i];
			playlist.arquivos[i].setNomeArquivo(this.arquivos[i].getNomeArquivo());
		}
		
		return playlist;
	}
	
	public ArquivoMultimidia[] getArquivos() {
		return arquivos;
	}
}
