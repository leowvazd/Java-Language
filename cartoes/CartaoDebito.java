package cartoes;

public class CartaoDebito {
    protected String titular;
    protected double saldo = 0;

    public void adicionarSaldo(double valor) {
        saldo += valor;
    }

    public double verificarSaldoDebito() {
        return saldo;
    }

    public boolean pagarComDebito(double valor) {
        if (saldo - valor < 0) {
            return false;
        }
        saldo -= valor;
        return true;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
}
