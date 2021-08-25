package navegador;

public class Navegador {
	static int qtdNoHistorico = 0, limite, qtdAbertas = 0;
	static AbaNavegador[] abasAbertas;
	static String[] historico = new String[100];
	
	protected static void adicionarNasAbasAbertas() {
		
	}
	
	protected static void adicionarNoHistorico(String expressao) {
		if(qtdNoHistorico < 99) {
			historico[qtdNoHistorico] = expressao;
		}
		else {
			for(int i = 0; i < 99; i++) {
				historico[i] = historico[i+1];
			}
			historico[99] = expressao;
		}
	}
	
	public Navegador(int limiteAbas) {
		Navegador.limite = limiteAbas;
		Navegador.abasAbertas = new AbaNavegador[limiteAbas];
	}
	
	public AbaNavegador abrirAba(int tipo, String titulo) {
		AbaNavegador novaAba = null; 
		if(Navegador.qtdAbertas+1 > Navegador.limite) return null;
		if(tipo == 1) {
			novaAba = new AbaBuscador();
			novaAba.tipo = "Buscador";
			novaAba.titulo = titulo;
		}
		if(tipo == 2) {
			novaAba = new AbaRedeSocial();
			novaAba.tipo = "RedeSocial";
			novaAba.titulo = titulo;
		}
		if(novaAba != null) {
			abasAbertas[qtdAbertas] = novaAba;
			qtdAbertas++;
		}
		
		return novaAba;	
	}
	public void fecharAba(AbaNavegador aba) {
		boolean encontrado = false;
		for(int i = 0; i < abasAbertas.length && abasAbertas[i] != null; i++) {
			if(encontrado) {
				abasAbertas[i-1] = abasAbertas[i];
				if(i == limite-1) abasAbertas[i] = null;
			}
			if(abasAbertas[i] == aba) {
				abasAbertas[i] = null;
				encontrado = true;
			}
		}
		qtdAbertas--;
	}
	
	public String[] getAbas() {
		String[] abasString = new String[qtdAbertas];
		for(int i = 0; i < qtdAbertas; i++) {
			abasString[i] = abasAbertas[i].tipo+ " " + abasAbertas[i].titulo;
		}
		return abasString;
	}
	
	public static String[] getHistorico() {
		String[] historicoAux = new String[qtdNoHistorico];
		for(int i = 0; historico[i] != null; i++) {
			historicoAux[i] = historico[i];
		}
		return historicoAux;
	}
	
}
