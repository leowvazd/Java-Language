package classificacao;

public class KNN {

	private int k;
	private ListaExemplos dadosTreinamento;

	public KNN(int k) {
		this.k = k;
	}

	public void setDadosTreinamento(ListaExemplos lista) {
		this.dadosTreinamento = lista;
	}

	public int predizer(double[] atributosEntrada) throws Exception {

		

		try {
			
			if (dadosTreinamento.getQtdExemplos() == 0) {
				throw new Exception("Dados de treinamento - nao inicializado");
			}

			if (k != dadosTreinamento.getQtdExemplos()) {
				throw new ExcecaoDadosInvalidos(dadosTreinamento.getQtdExemplos(), k);
			}
			
			dadosTreinamento.ordenarPelaDistancia(atributosEntrada);

			int[][] qtdades = new int[dadosTreinamento.getExemplos().length][2];

			// Conta quantos há de cada um diferente
			int contador = 0;
			boolean primeiro = true;
			for (int i = 0; i < k; i++) {
				if (primeiro) {
					qtdades[i][0] = dadosTreinamento.getExemplos()[i].getRotuloClasse();
					qtdades[i][1]++;
					primeiro = false;
					contador++;
					continue;
				}

				if (dadosTreinamento.getExemplos()[i].getRotuloClasse() == qtdades[i][0]) {
					qtdades[i][1]++;
					continue;
				}

				qtdades[i][0] = dadosTreinamento.getExemplos()[i].getRotuloClasse();
				qtdades[i][1]++;
				contador++;
			}

			// Ordena pela quantidade
			for (int i = 0; i < contador; i++) {
				for (int j = 0; j < i; j++) {
					if (qtdades[i][1] > qtdades[j][1]) {
						int temp = qtdades[i][1];
						qtdades[i][1] = qtdades[j][1];
						qtdades[j][1] = temp;
					}
				}
			}

			// retorna o de maior quantidade
			return qtdades[0][0];
		} catch (Exception e) {
			throw new Exception("Dados de treinamento - nao inicializado");
		}

	}
}
