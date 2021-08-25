package automotores;

public class Motocicleta extends Veiculo {

    private boolean temCarroLateral;

    public Motocicleta(String modelo) {
        super();
        setModelo(modelo);
    }

    public boolean getTemCarroLateral() {
        return temCarroLateral;
    }

    public void setTemCarroLateral(boolean temCarroLateral) {
        this.temCarroLateral = temCarroLateral;
    }

    @Override
    public String getTipo() {
        return "Motocicleta modelo " + modelo;
    }
}
