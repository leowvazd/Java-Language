package quadrilateros;

public class Paralelogramo extends Quadrilatero {

    public void setLados(double ladoA, double ladoB) {
        super.setLados(ladoA, ladoA, ladoB, ladoB);
    }

    @Override
    public String getPropriedades() {
        return super.getPropriedades() + "Lados opostos paralelos.";
    }
}
