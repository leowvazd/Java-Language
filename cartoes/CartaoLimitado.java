package cartoes;

public class CartaoLimitado extends CartaoCredito {
    @Override
    public boolean pagarComCredito(double valor) {
        if (valor + valorDevidoComCredito > 200) {
            return false;
        }
        return super.pagarComCredito(valor);
    }
}
