package quadrilateros;

public abstract class Quadrilatero {

    private double ladoAB;
    private double ladoBC;
    private double ladoCD;
    private double ladoDA;

    protected void setLados(double ladoAB, double ladoBC, double ladoCD, double ladoDA) {
        this.ladoAB = ladoAB;
        this.ladoBC = ladoBC;
        this.ladoCD = ladoCD;
        this.ladoDA = ladoDA;
    }

    public double getPerimetro() {
        return ladoAB + ladoBC + ladoCD + ladoDA;
    }

    public String getPropriedades() {
        return "Figura de quatro lados. ";
    }
}
