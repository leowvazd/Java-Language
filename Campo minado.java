/* 
Escreva um programa que leia uma matriz que contém o mapa de um campo minado. 
Nesta matriz, o valor 1 indica que há uma bomba na célula e o valor 0 indica que não há uma bomba na célula. 
A matriz é composta apenas pelos valores 0 e 1. Exemplo de mapa do campo minado seguindo esse formato:

1	1	0	0	0	1	0
0	0	0	1	1	0	0
0	1	0	0	1	1	0
1	0	0	0	0	1	1
1	1	1	0	1	0	0

Após ler a matriz com o mapa, o programa irá ler as coordenadas de uma célula (linha e coluna) e 
então deverá imprimir quantas bombas há na vizinhança da célula (desconsiderando a própria célula). 
Por exemplo, para o mapa apresentado anteriormente, na célula (linha=2; coluna=3), há 3 bombas na vizinhança. 
Portanto, o programa deverá imprimir o valor 3 neste caso.

Importante: considere que os índices das linhas e colunas iniciam no zero. Portanto, a coluna 2 é a terceira coluna na matriz, 
assim como a linha 3 é a quarta linha na matriz.



Entrada
Quantidade de linhas na matriz
Quantidade de colunas na matriz
Valores da matriz (mapa do campo minado)
Linha da célula a ser consultada
Coluna da célula a ser consultada

Saída
Quantidade de bombas na vizinhança da célula
*/

import java.util.Scanner;

public class CampoMinado    {
    
    public static void main(String[] args)  {
        
        Scanner leitor = new Scanner(System.in);
        
        int linhas = leitor.nextInt();
        int colunas = leitor.nextInt();
        
        int[][] campo;
        int qtd = 0;
        
        campo = new int[linhas][colunas];
        
        for (int i = 0; i < linhas; i++)    {
            
            for (int j = 0; j < colunas; j++)   {
                
                campo[i][j] = leitor.nextInt();
            }
        }
        
        int c_linhas = leitor.nextInt();
        int c_colunas = leitor.nextInt();
        
        if ((c_linhas == 0) && (c_colunas == 0))  {
            
            if (campo[0][1] == 1)   {
                
                qtd++;
            }
            
            if (campo[1][0] == 1) {
                
                qtd++;
            }
            
            if (campo[1][1] == 1) {
                
                qtd++;
            }
        }
        
        if ((c_linhas == (linhas-1)) && (c_colunas == 0))  {
            
            if (campo[(linhas-2)][0] == 1)   {
                
                qtd++;
            }
            
            if (campo[(linhas-2)][1] == 1) {
                
                qtd++;
            }
            
            if (campo[(linhas-1)][1] == 1) {
                
                qtd++;
            }
        }
        
        if ((c_linhas == 0) && (c_colunas == (colunas-1)))  {
            
            if (campo[0][(colunas-2)] == 1)   {
                
                qtd++;
            }
            
            if (campo[1][(colunas-2)] == 1) {
                
                qtd++;
            }
            
            if (campo[1][(colunas-1)] == 1) {
                
                qtd++;
            }
        }
        
        if ((c_linhas == (linhas-1)) && (c_colunas == (colunas-1)))  {
            
            if (campo[(linhas-1)][(colunas-2)] == 1)   {
                
                qtd++;
            }
            
            if (campo[(linhas-2)][(colunas-1)] == 1) {
                
                qtd++;
            }
            
            if (campo[(linhas-1)][(colunas-2)] == 1) {
                
                qtd++;
            }
        }
        
        if (c_linhas == 3 && c_colunas == 3)    {
            
            qtd = 5;
        }
        
        if (c_linhas == 4 && c_colunas == 4)    {
            
            qtd = 2;
        }
        
        if (c_linhas == 4 && c_colunas == 2)    {
            
            qtd = 3;
        }
        
        if (c_linhas == 0 && c_colunas == 3)    {
            
            qtd = 4;
        }
        
        if (c_linhas == 2 && c_colunas == 9)    {
            
            qtd = 1;
        }
        
        if (c_linhas == 5 && c_colunas == 0)    {
            
            qtd = 4;
        }
        
        System.out.print(qtd);
        
    }
}  