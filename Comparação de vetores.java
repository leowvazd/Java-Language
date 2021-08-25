/* 
Escreva um programa que leia dois vetores (A e B) de mesmo comprimento n. 
Para isso, o programa deve ler um valor inteiro n (comprimento), ler o n valores de um dos vetores e depois os n valores do outro vetor. 
Ao final, o programa deve imprimir "SIM" se um vetor for o resultado de uma multiplicação de todos os elementos do outro pelo mesmo valor, 
ou "NAO" caso contrário (não há til ~ em NAO).

Por exemplo, considere os vetores A = [1, 2, 5, 10] e B = [3, 6, 15, 30]. Neste caso, o programa deve imprimir "SIM", pois o vetor B é 
resultado da multiplicação de todos os elementos de A por 3.

Outro exemplo: considere os vetores A = [1, 2, 5, 10] e B = [3, 6, 15, 90]. Neste caso, o programa deve imprimir "NAO", pois o vetor B não
 é resultado da multiplicação de todos os elementos de A por um mesmo valor. Os três primeiros números foram multiplicados por 3, 
mas o quarto foi multiplicado por 9.

Entrada
Comprimento (n)
n elementos do primeiro vetor
n elementos do segundo vetor

Saída
SIM/NAO (dependendo se um vetor for o resultado de uma múltiplicação de todos os exemplos do outro por um mesmo valor)
*/

import java.util.Scanner;

public class ComparaVetores   {
    
    public static void main(String[] args)   {
        
        int sim = 0;
        int nao = 0;
        
        Scanner leitor = new Scanner(System.in);
        int n = leitor.nextInt();
        
        int[] v1 = new int[n];
        int[] v2 = new int[n];
        
        for (int i=0; i<n; i++) {
            
            v1[i] = leitor.nextInt();
        }
        
        for (int i=0; i<n; i++) {
            
            v2[i] = leitor.nextInt();
        }
        
        for (int i=0;i<n;i++)   {
            
            for (int a=0; a<n;a++)  {
                
                if (v2[a]/v1[a] == v2[n-1]/v1[n-1]) {
                    
                    sim++;
                }
                
                else    {
                    
                    nao++;
                }
            }
        }
        
        if (nao==0) {
            System.out.println("SIM");
        }
        
        else    {
            
            System.out.println("NAO");
        }
    }
}