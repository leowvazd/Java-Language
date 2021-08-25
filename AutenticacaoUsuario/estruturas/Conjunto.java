package estruturas;

public class Conjunto implements Lista {

	private int[] numeros;
	private int quantidade;
	
	public static Conjunto uniao(Conjunto a, Conjunto b) {
		
		Conjunto uniao = new Conjunto();
		
		for (int i : a.getNumeros()) {
			uniao.adicionar(i);
		}
		
		for(int i = 0; i < b.getNumeros().length; i++) {
			boolean repetido = false;
			for(int j = 0; j < a.getNumeros().length; j++) {
				if(b.getNumeros()[i] == a.getNumeros()[j]) {
					repetido = true;
				}
			}
			if(repetido == false) {
				uniao.adicionar(b.getNumeros()[i]);
			}
		}
		return uniao;
	}
	
	public static Conjunto intersecao(Conjunto a, Conjunto b) {
		Conjunto intersecao = new Conjunto();
		
		for(int i = 0; i < b.getNumeros().length; i++) {
			for(int j = 0; j < a.getNumeros().length; j++) {
				if(b.getNumeros()[i] == a.getNumeros()[j]) {
//					System.out.println(b.getNumeros()[i] + " " +  a.getNumeros()[j]);
					intersecao.adicionar(a.getNumeros()[j]);
				}
			}
		}
		
		return intersecao;
	}
	
	@Override
	public int getQtd() {
		return numeros.length;
	}

	@Override
	public void adicionar(int numero) {
		if(numeros == null) {
			numeros = new int[1];
			numeros[0] = numero;
		} else {
			int[] temp = new int[quantidade];
			temp = numeros;
			quantidade = numeros.length + 1;
			numeros = new int[quantidade];
			for (int i = 0; i < temp.length; i++) {
				numeros[i] = temp[i];
			}
			numeros[quantidade - 1] = numero;			
		}
	}

	@Override
	public void remover(int numero) {
		quantidade--;
		int[] temp = new int[quantidade];
		
		int iRemovido = 0;
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == numero)
				iRemovido = i;
		}
		
		for (int i = 0; i < iRemovido; i++) {
			temp[i] = numeros[i];
		}
		
		if(iRemovido < numeros.length) {
			for (int i = numeros.length - 1; i > iRemovido; i--) {
				temp[i - 1] = numeros[i];
			}
		}
		
		numeros = temp;
	}

	@Override
	public int buscar(int numero) {
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == numero) {
				return i;
			}
		}
		return -1;
	}
	
	@Override
	public String toString() {
		String saida = "";
		for(int i = 0; i < numeros.length; i++) {
			if(numeros.length - i > 0) {
				saida += i + " ";
			} else {
				saida += i;
			}
		}
		return saida;
	}
	
	public int[] getNumeros() {
		return numeros;
	}

}
