package quadrilateros;

public class Retangulo extends Paralelogramo {

    public void setLados(double ladoA, double ladoB) {
        super.setLados(ladoA, ladoA, ladoB, ladoB);
    }

    @Override
    public String getPropriedades() {
        return super.getPropriedades() + "Ângulo de 90 graus em todos os vértices";
    }
}
