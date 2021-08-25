package classificacao;

public class ListaExemplos {

	private Exemplo[] exemplos;
	private int maxQtd;

	public ListaExemplos(int maxQtd) {
		this.maxQtd = maxQtd;
	}

	public void adicionarExemplo(Exemplo exemplo) throws Exception {
		if (exemplos == null) {
			exemplos = new Exemplo[1];
			exemplos[0] = exemplo;
		} else {
			if (exemplos.length < maxQtd) {

				Exemplo[] temp = new Exemplo[exemplos.length + 1];

				for (int i = 0; i < exemplos.length; i++) {
					temp[i] = exemplos[i];
				}

				temp[exemplos.length] = exemplo;
				exemplos = temp;

			} else {
				throw new Exception("Quantidade máxima de exemplos já atingida");
			}
		}
	}

	public void ordenarPelaDistancia(double[] atributosEntrada) {
		calcularDistancias(atributosEntrada);
		
		for (int i = 0; i < exemplos.length; i++) {
			for (int j = 0; j < i; j++) {
				if(exemplos[i].getDistancia() < exemplos[j].getDistancia()) {
					Exemplo temp = exemplos[i];
					exemplos[i] = exemplos[j];
					exemplos[j] = temp;
				}
			}
		}
		
	}
	
	public int getQtdExemplos() {
		return exemplos.length;
	}
	
	public Exemplo[] getExemplos() {
		return exemplos;
	}
	
	public Exemplo[] getPrimeirosExemplos(int n) throws Exception {
		try {
			Exemplo[] primeiros = new Exemplo[n];
			for (int i = 0; i < primeiros.length; i++) {
				primeiros[i] = exemplos[i];
			}
			
			return primeiros;
		} catch (Exception e) {
			throw new Exception("Quantidade inválida (maior que o total de exemplos)");
		}
	}
	
	public Exemplo[] getUltimosExemplos(int n) throws Exception {
		try {
			Exemplo[] ultimos = new Exemplo[n];

			for (int j = 0, i = exemplos.length - 1; j < n;i--, j++) {
				ultimos[j] = exemplos[i];
			}
			
			return ultimos;
		} catch (Exception e) {
			throw new Exception("Quantidade inválida (maior que o total de exemplos)");
		}
	}
	
	public double[] calcularDistancias(double[] atributosEntrada) {
		double[] distancias = new double[exemplos.length];
		
		for (int j = 0; j < exemplos.length; j++) {
			
			double[] x = atributosEntrada;
			double[] y = exemplos[j].getAtributosEntrada();
			
			double soma = 0;
			for (int i = 0; i < y.length; i++) {
				soma += Math.pow((x[i] - y[i]), 2);
			}
			distancias[j] = Math.sqrt(soma);
			exemplos[j].setDistancia(distancias[j]);
		}
		
		return distancias;
		
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for (Exemplo exemplo : getExemplos()) {
			sb.append(exemplo + "\n");
		}
		
		return sb.toString();
	}

}
