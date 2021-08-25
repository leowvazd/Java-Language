/*
Classe Playlist:

Construtor: esta classe deve possuir apenas o construtor sem parâmetros, que inicializa a playlist sem nenhum arquivo. Uma playlist pode ter no máximo 100 arquivos.
Métodos:
public void adicionarItem(ArquivoMultimidia arquivo) - adiciona um arquivo mulmídia no final da lista de arquivos.
public void renomearItem(int indiceArquivo, String novoNomeArquivo) - altera o nome de um arquivo na lista de arquivos da playlist.
public void moverParaInicio(int indiceArquivo) - move o arquivo especificado para o início da lista.
public String[] listarArquivos() - retorna um vetor de String com os nomes dos arquivos na playlist. O comprimento desse vetor é a quantidade de arquivos adicionados na playlist.
public Playlist clone() - sobrescreve o método clone de Object. Esse método deve realizar uma cópia profunda do objeto Playlist. Nessa cópia profunda, inclusive as instâncias dos arquivos devem ser copiadas na nova instância retornada.
*/

package multimidia;

public class Playlist {
    
    static int qtdArquivos = 0;
	ArquivoMultimidia[] playlist = new ArquivoMultimidia[100];

    
    public Playlist(){}
    
    public void adicionarItem(ArquivoMultimidia arquivo){
            
        playlist[qtdArquivos] = arquivo;
        qtdArquivos++;
        
    }
    
    public void renomearItem(int indiceArquivo, String novoNomeArquivo){
        playlist[indiceArquivo].setNomeArquivo(novoNomeArquivo);
    }
    
    public void moverParaInicio(int indiceArquivo){
       
      for(int i = qtdArquivos; i >= 0; i--) {
			playlist[i + 1] = playlist[i];
		}
		
		playlist[0] = playlist[indiceArquivo + 1];
		
		for(int i = indiceArquivo + 1; i < qtdArquivos + 1; i++) {
			playlist[i] = playlist[i + 1];
		}
		
		playlist[qtdArquivos + 1] = null;
    }
    
    public String[] listarArquivos() {
		String[] lista = new String[qtdArquivos];
		for (int i = 0; i < qtdArquivos; i++) {
			lista[i] = playlist[i].getNomeArquivo();
		}
		
		return lista;
	}
    
    @Override
    public Playlist clone() throws CloneNotSupportedException{
        Playlist copia = new Playlist();
		
		for (int i = 0; i < qtdArquivos; i++) {
			copia.qtdArquivos = this.qtdArquivos;
			copia.playlist[i] = this.playlist[i];
			copia.playlist[i].setNomeArquivo(this.playlist[i].getNomeArquivo());
		}
		
		return copia;
    }
    
    public ArquivoMultimidia[] getArquivos() {
		return playlist;
	}
    

}

