package navegador;

public class Navegador {

	private int limiteAbas;
	private int posicaoAba;
	private int posicaoHistorico;
	private String[] historico;
	private AbaNavegador[] abasNavegador;

	// Construtor limita o número de abas
	public Navegador(int limiteAbas) {
		this.limiteAbas = limiteAbas;
		this.abasNavegador = new AbaNavegador[limiteAbas];
		historico = new String[100];
	}

	// Método que cria nova aba no navegador
	public AbaNavegador abrirAba(int tipo, String titulo) {
		if (posicaoAba < limiteAbas) {
			switch (tipo) {
			case 1:
				abasNavegador[posicaoAba] = new AbaBuscador(tipo, titulo);
				abasNavegador[posicaoAba].setNumero(posicaoAba);
				abasNavegador[posicaoAba].setAberta(true);
				break;
			case 2:
				abasNavegador[posicaoAba] = new AbaRedeSocial(tipo, titulo);
				abasNavegador[posicaoAba].setNumero(posicaoAba);
				abasNavegador[posicaoAba].setAberta(true);
				break;
			default:
				break;
			}

			atualizaHistorico("Abriu aba", titulo);
			posicaoAba++;

			carregaArrayDeAbas();

			return abasNavegador[posicaoAba - 1];
		}
		return null;
	}

	// Fecha aba do navegador
	public void fecharAba(AbaNavegador aba) {
		atualizaHistorico("fechou aba " + aba.getNumero(), aba.getTitulo());
		abasNavegador[aba.getNumero()].setAberta(false);

		AbaNavegador[] novaDisposicao = new AbaNavegador[this.limiteAbas];
		int num = 0;
		for (int i = 0; i < this.limiteAbas; i++) {
			if (this.abasNavegador[i].isAberta()) {
				novaDisposicao[num] = this.abasNavegador[i];
				num++;
			}
		}

		this.abasNavegador = novaDisposicao;
		posicaoAba--;
	}

	// Retorna array de informações sobre as abas
	public String[] getAbas() {
		String[] abas = new String[posicaoAba];
		for (int i = 0; i < posicaoAba; i++) {
			abas[i] = abasNavegador[i].toString();
		}

		return abas;
	}
	
	public AbaNavegador[] getAbasNavegador() {
		return abasNavegador;
	}

	public AbaNavegador getAba(int numero) {
		if (numero <= posicaoAba && numero >= 0) {
			return abasNavegador[numero];
		}
		
		return null;
	}

	public AbaNavegador getAba(String titulo) {
		for (AbaNavegador abaNavegador : abasNavegador) {
			if (abaNavegador.getTitulo().equals(titulo)) {
				return abaNavegador;
			}
		}
		return null;
	}
	
	public void buscar(int numAba, String expressao) {
		AbaBuscador aba = (AbaBuscador)abasNavegador[numAba];
		aba.buscar(expressao);
		atualizaHistorico(aba.getTitulo() +  "[Busca]", expressao);
		abasNavegador[numAba] = aba;
	}
	
	public void postar(int numAba, String expressao) {
		AbaRedeSocial aba = (AbaRedeSocial)abasNavegador[numAba];
		aba.postar(expressao);
		atualizaHistorico(aba.getTitulo() +  " [Post]", expressao);
		abasNavegador[numAba] = aba;
	}

	// Retorna histórico em array
	public String[] gethistorico() {
		return historico;
	}

	public void atualizaHistorico(String acao, String tituloAba) {
		historico[posicaoHistorico] = "[" + posicaoHistorico + ": " + acao + "|" + tituloAba + "]";
		posicaoHistorico++;
	}

	// Inicialização das abas vazias para evitar NullPointerException
	private void carregaArrayDeAbas() {
		for (int i = posicaoAba; i < limiteAbas; i++) {
			abasNavegador[i] = new AbaNavegador(0, "") {
				@Override
				public String getTipo() {
					return "vazia";
				}

				@Override
				protected void atualizaHistorico(String string) {
					
				}
			};
		}
	}

	public String getHistorico() {
		String saida = "";
		for (String h : this.historico) {
			if (h != null) {
				saida += h + "\n";
			}
		}
		return saida;
	}
}
