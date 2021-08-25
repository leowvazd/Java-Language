package matematica;

public class Fracao {
    private int numerador;
    private int denominador;

    Fracao() {
        this.denominador = 1;
    }

    Fracao(int numerador, int denominador) {
        int i = 1;
        //Simplificando
        while (numerador % i == 0 && denominador % i == 0) {
            while (numerador % i == 0) {
                numerador /= i;
                denominador /= i;
            }
            i++;
        }
        this.numerador = numerador;
        if (denominador != 0)
            this.denominador = denominador;
    }

    private int calculaMmc(int n1, int n2) {
        int resultado, n;
        n = 2;
        resultado = 1;
        while (n1 != 1 || n2 != 1) {
            while (n1 % n != 0 && n2 % n != 0) {
                n++;
            }
            if (n1 % n == 0) {
                n1 /= n;
            }
            if (n2 % n == 0) {
                n2 /= n;
            }
            resultado *= n;
        }
        return resultado;
    }

    public String getRepresentacao() {
        return numerador + "/" + denominador;
    }

    public Fracao somar(Fracao f2) {
        int novoDenominador = calculaMmc(denominador, f2.denominador);
        int novoNumerador = (novoDenominador / denominador) * numerador + (novoDenominador / f2.denominador) * f2.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }

    public static Fracao somar(Fracao f1, Fracao f2) {
        return f1.somar(f2);
    }

    public static Fracao somar(Fracao[] fracoes) {
        Fracao f1, f2;
        f1 = fracoes[0];
        for (int i = 1; i < fracoes.length; i++) {
            f2 = fracoes[i];
            f1 = Fracao.somar(f1, f2);
        }
        return f1;
    }

    public static Fracao multiplicar(Fracao f1, Fracao f2) {
        return new Fracao(f1.numerador * f2.numerador, f1.denominador * f2.denominador);
    }
}
