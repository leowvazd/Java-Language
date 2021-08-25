package automotores;

public abstract class Veiculo {
    protected String modelo;
    public Veiculo() {

    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return "Veículo genérico modelo " + modelo;
    }
}
