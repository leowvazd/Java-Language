public class Paralelogramo {
    private int ladoA;
    private int ladoB;
    private String tipo;

    Paralelogramo(int ladoA) {
        this.ladoA = ladoA;
        tipo = "Quadrado";
    }

    Paralelogramo(int ladoA, int ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoA;
        tipo = "Retângulo";
    }

    public int getArea() {
        if (tipo.equals("Quadrado")) {
            return ladoA * ladoA;
        }
        return ladoA * ladoB;
    }

    public String getTipo() {
        return "Paralelogramo " + tipo;
    }
}
