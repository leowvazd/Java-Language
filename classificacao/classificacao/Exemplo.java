package classificacao;

class Exemplo {

	private double[] atributosEntrada;
	private int rotuloClasse;
	private double distancia;
	
	public Exemplo(double[] atributosEntrada, int rotuloClasse) {
		this.atributosEntrada = atributosEntrada;
		this.rotuloClasse = rotuloClasse;
	}

	public double[] getAtributosEntrada() {
		return atributosEntrada;
	}

	public int getRotuloClasse() {
		return rotuloClasse;
	}
	
	public double getDistancia() {
		return distancia;
	}
	
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(double d : getAtributosEntrada()) {
			sb.append(d + " ");
		}
		sb.append(getRotuloClasse());
		
		return sb.toString();
	}
	
}
