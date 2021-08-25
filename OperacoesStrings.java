/*
Implemente a classe OperacoesStrings, que possui os seguintes métodos:

void setTexto(String texto): guarda uma String na instância
String getTexto(): retorna a String armazenada na instância
int contaPalavras(): retorna a quantidade de palavras na String armazenada por setTexto()
double comprimentoMedioPalavras(): retorna o comprimento médio das palavras na String armazenada por setTexto()
String maiorPalavra(): retorna uma String com a maior palavra na String armazenada por setTexto()
int comprimentoMaiorPalavra(): retorna o comprimento da maior palavra na String armazenada por setTexto()
Observação: a String de entrada pode ter mais de um espaço separando as palavras, além de possuir sinais de pontuação. 
Por exemplo: "Esta      eh uma    frase de  teste.   "

Dica: para acessar um caractere específico em uma instância de String, pode usar o método charAt(). Por exemplo:

String texto = "ABCD";
if (texto.charAt(0) == 'A') {
   System.out.println("Letra A");
}


Importante: Submeta apenas o código da classe pública OperacoesStrings. A classe OperacoesStrings não pode realizar impressão na tela, 
utilizar import e usar funções prontas para separar as palavras (por exemplo, split ou expressão regular). O programa 
(com main) já existe no sistema de correção. O programa lê uma String e fica lendo códigos de operação conforme descrito a seguir:

1: Conta palavras
2: Comprimento maior palavra
3: Média do comprimento do palavra
4: Maior palavra
0: encerra o programa

*/

import java.util.ArrayList;

public class OperacoesStrings {
    String texto;

    OperacoesStrings(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    int contaPalavaras() {
        return texto.length();
    }

    double comprimentoMedioPalavras() {
        ArrayList<String> palavrasSeparadas = separarPalavras();
        int somaComprimentos = somarComprimentos(palavrasSeparadas);
        return somaComprimentos / (double) palavrasSeparadas.size();
    }

    String maiorPalavra() {
        ArrayList<String> palavras = separarPalavras();
        String maiorPalavra = palavras.get(0);
        for (String palavra: palavras) {
            if (palavra.length() > maiorPalavra.length()) {
                maiorPalavra = palavra;
            }
        }
        return maiorPalavra;
    }

    int comprimentoMaiorPalavra() {
        String maiorPalavra = maiorPalavra();
        return maiorPalavra.length();
    }

    private int somarComprimentos(ArrayList<String> palavrasSeparadas) {
        int soma = 0;
        for (String palavra : palavrasSeparadas) {
            soma += palavra.length();
        }
        return soma;
    }

    private ArrayList<String> separarPalavras() {
        ArrayList<String> palavrasSeparadas = new ArrayList<>();
        StringBuilder palavra = new StringBuilder();
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == ' ') {
                if (!palavra.toString().equals("")) {
                    palavrasSeparadas.add(palavra.toString());
                    palavra = new StringBuilder();
                }
            } else {
                palavra.append(c);
            }
        }
        return palavrasSeparadas;
    }
}
