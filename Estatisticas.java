/* 
Faça um programa que fique lendo números do usuário até que seja digitado um valor negativo. 
Quando isso ocorrer, o programa deve imprimir os seguintes valores sobre a sequência de valores lidos 
(ignore o valor negativo lido, ele não faz parte da sequência de valores válidos):

Soma
Média (imprima com duas casas decimais após a vírgula)
Mínimo
Máximo
Dica: para formatar um número fracionário, use String.format. Por exemplo:

double n = 10 / 3;
System.out.println(String.format("%.2f", n)); // Imprime o valor de n com duas casas decimais após a vírgula


Entrada:
Sequência de números inteiros de tamanho indefinido
Saída:
Soma
Média (imprima com duas casas decimais após a vírgula)
Mínimo
Máximo
*/
import java.util.Scanner;

public class Estatisticas   {
    
    public static void main(String[] args)   {
        
        int soma = 0;
        double media = 0;
        int min = -999999999;
        int max = 999999999;
        int qtd = 0;
        int b = 0;
        
        Scanner n = new Scanner(System.in);

    while ((b = n.nextInt()) > 0) {
            
            soma = soma + b;
            qtd++;
            
            if (min <= b)   {
                min = b;
            }
            
            if (max >= b)   {
                max = b;
            }
            
        }
        
        media = ((double)soma)/((double)qtd);
        
        System.out.println(soma);
        System.out.println(String.format("%.2f",media));
        System.out.println(max);
        System.out.println(min);
        
    }
}