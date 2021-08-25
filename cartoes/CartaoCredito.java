package cartoes;

public class CartaoCredito extends CartaoDebito {
    protected double valorDevidoComCredito = 0;

    public boolean pagarComCredito(double valor) {
        valorDevidoComCredito += valor;
        return true;
    }

    public void quitarCredito(double valor) {
        if (valor <= valorDevidoComCredito) {
            valorDevidoComCredito -= valor;
        }
    }

    public double verificarExtrato() {
        return valorDevidoComCredito;
    }
}
