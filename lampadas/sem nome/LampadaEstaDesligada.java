
class LampadaEstaDesligada extends Exception {
	private static final long serialVersionUID = 1L;

	public LampadaEstaDesligada() {
		super("A lampada ja esta desligada.");
	}

}
