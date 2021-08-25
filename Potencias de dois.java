/* 
Leia uma sequência de n inteiros e mostre quantos são potências de 2.

Observação 1: crie um método que, dado um número inteiro, retorne se ele é ou não potência de 2.

Observação 2: não utilize Math.

Entrada (o primeiro número lido é o comprimento do vetor, que no caso é 5):
5
2
8
9
10
16

Saída:
3
*/

import java.util.Scanner;

public class Potencias2 {
	public static boolean potencia2(int numero) {
		if (numero < 1) return false;

		while (numero > 1) {
			if (numero % 2 != 0)
				return false;
			numero = numero / 2;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int n = leitor.nextInt();
		
		int qtdPotencias = 0;
		for (int i = 0; i < n; i++){
			int novoNumero = leitor.nextInt();
			if (potencia2(novoNumero)) qtdPotencias++;
		}	

		System.out.println(qtdPotencias);
	}
}