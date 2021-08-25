/* 
Faça um programa que leia um valor inteiro N que representa a quantidade de linhas para impressão de uma pirâmide de números 1. 
A figura impressa é composta apenas pelos caracteres hífen (-) e o número 1. Por exemplo, uma pirâmide com altura 5 deve ser representada 
da seguinte forma:

----1----
---111---
--11111--
-1111111-
111111111

Dica (Java): é possível imprimir sem quebrar linha usando o método System.out.print() ao invés de System.out.println(). 
Veja nos exemplos a seguir (observação: apenas os comandos de impressão são mostrados na tabela, mas o programa em Java precisa incluir 
outros componentes, como declaração da classe, método main, etc).

Programa 1				Programa 2
System.out.println("1");	System.out.println("1");
System.out.println("1");	System.out.print("1");
System.out.print("1");		System.out.println("1");

Saída do programa 1	Saída do programa 2
1				111
1
1

Entrada:
Quantidade de linhas (altura) da pirâmide

Saída:

Pirâmide
*/

import java.util.Scanner;

public class Piramide   {
    
    public static void main(String[] args)   {
        
        int i;
        int k = 0;
        int j = 1;
        
        Scanner leitor = new Scanner(System.in);
        int linhas = leitor.nextInt();
        
        
        for (i = 1; i <= linhas; ++i, k = 0)    {
            
            for (int espaco = 1; espaco <= linhas - i; ++espaco)    {
                
                System.out.print("-");
            }
            
            while (k != 2 * i - 1)  {
                
                System.out.print("1");
                ++k;
            }
            
            for (int espaco = 1; espaco <= linhas - i; ++espaco)    {
                
                System.out.print("-");
            }
            
            System.out.println();
        }
    }
}