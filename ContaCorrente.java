public class ContaCorrente {
    private String nome;
    private double saldo;
    private static int quantidadeContas = 0;

    public ContaCorrente(String nome) {
        this.nome = nome;
        quantidadeContas++;
    }

    public ContaCorrente(String nome, double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getTitular() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor) {
        if (valor > 0) {
            if (saldo - valor >= 0) {
                saldo -= valor;
                return true;
            }
        }
        return false;
    }

    public static boolean transferir(ContaCorrente de, ContaCorrente para, double valor) {
        if (de.sacar(valor)) {
            return para.depositar(valor);
        }
        return false;
    }

    public static int getQuantidadeContas() {
        return quantidadeContas;
    }
}
