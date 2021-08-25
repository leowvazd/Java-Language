package multimidia;

public class Playlist {

	private ArquivoMultimidia[] arquivos;
	private int contaArquivos;

	// inicializa a playlist sem nenhum arquivo. Uma playlist pode ter no máximo 100
	// arquivos
	public Playlist() {
		this.arquivos = new ArquivoMultimidia[10];
	}

	// adiciona um arquivo multimídia no final da lista de arquivos
	public void adicionarItem(ArquivoMultimidia arquivo) throws QuantidadeLimiteArquivos {
		if (contaArquivos < arquivos.length) {
			arquivos[contaArquivos] = arquivo;
			contaArquivos++;
		} else {
			throw new QuantidadeLimiteArquivos();
		}

	}

	// altera o nome de um arquivo na lista de arquivos da playlist
	public void renomearItem(int indiceArquivo, String novoNomeArquivo) throws IndiceArquivoInvalido {
		if (arquivos[indiceArquivo] != null) {
			arquivos[indiceArquivo].setNomeArquivo(novoNomeArquivo);
		} else {
			throw new IndiceArquivoInvalido(indiceArquivo);
		}

	}

	// move o arquivo especificado para o início da lista.
	public void moverParaInicio(int indiceArquivo) throws IndiceArquivoInvalido {
		if (arquivos[indiceArquivo] != null) {
			for (int i = contaArquivos; i >= 0; i--) {
				arquivos[i + 1] = arquivos[i];
			}

			arquivos[0] = arquivos[indiceArquivo + 1];

			for (int i = indiceArquivo + 1; i < contaArquivos + 1; i++) {
				arquivos[i] = arquivos[i + 1];
			}

			arquivos[contaArquivos + 1] = null;
		} else {
			throw new IndiceArquivoInvalido(indiceArquivo);
		}

	}

	// retorna um vetor de String com os nomes dos arquivos na playlist
	public String[] listarArquivos() {
		String[] lista = new String[contaArquivos];
		for (int i = 0; i < contaArquivos; i++) {
			lista[i] = arquivos[i].toString();
		}

		return lista;
	}

	// Ordena os arquivos da playlist conforme o tipo inserido como parâmetro
	public void ordenarArquivos(int tipo) {
		if (tipo == 1) {
			for (int i = 0; i < arquivos.length; i++) {
				for (int j = 0; j < i; j++) {

					if (arquivos[i] != null && arquivos[j] != null) {
						if (arquivos[i].getNomeArquivo().compareTo(arquivos[j].getNomeArquivo()) == -1) {
							ArquivoMultimidia temp = arquivos[i];
							arquivos[i] = arquivos[j];
							arquivos[j] = temp;
						}

						if (arquivos[i].getNomeArquivo().equals(arquivos[j].getNomeArquivo())) {
							if (arquivos[i].getTamanhoArquivo() < arquivos[j].getTamanhoArquivo()) {
								ArquivoMultimidia temp = arquivos[i];
								arquivos[i] = arquivos[j];
								arquivos[j] = temp;
							}
						}
					}
				}
			}
		}

		if (tipo == 2) {
			for (int i = 0; i < arquivos.length; i++) {
				for (int j = 0; j < i; j++) {

					if (arquivos[i] != null && arquivos[j] != null) {
						if (arquivos[i].getTamanhoArquivo() < arquivos[j].getTamanhoArquivo()) {
							ArquivoMultimidia temp = arquivos[i];
							arquivos[i] = arquivos[j];
							arquivos[j] = temp;
						}

						if (arquivos[i].getTamanhoArquivo() == arquivos[j].getTamanhoArquivo()) {
							if (arquivos[i].getNomeArquivo().compareTo(arquivos[j].getNomeArquivo()) == -1) {
								ArquivoMultimidia temp = arquivos[i];
								arquivos[i] = arquivos[j];
								arquivos[j] = temp;
							}
						}
					}
				}
			}
		}
	}

	// sobrescreve o método clone de Object. Esse método
	// deve realizar uma cópia profunda do objeto Playlist.
	// Nessa cópia profunda, inclusive as instâncias dos
	// arquivos devem ser copiadas na nova instância retornada
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
