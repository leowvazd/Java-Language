package automotores;

public class Carro extends Veiculo{

    private int numeroPortas;

    public Carro(String modelo) {
        super();
        setModelo(modelo);
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int nPortas) {
        this.numeroPortas = nPortas;
    }

    @Override
    public String getTipo() {
        return "Carro modelo " + modelo;
    }
}
