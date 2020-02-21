package trabajoGrupal_abstractClass;

public class Herb�voro extends Animal {
	private double movimiento;

	public Herb�voro() {
		super();
	}

	public Herb�voro(int tipoAlimentaci�n, double probAlimentaci�n, double probReproducci�n, boolean alimentaci�n,
			boolean reproducci�n) {
		super(tipoAlimentaci�n, probAlimentaci�n, probReproducci�n, alimentaci�n, reproducci�n);
	}

	public Herb�voro(int tipoAlimentaci�n) {
		super(tipoAlimentaci�n);
	}
	
	public void crearOtro() {
		animales.add(new Herb�voro(1));
		animales.get(animales.size()-1).setProbAlimentaci�n(Math.random()*70);
		animales.get(animales.size()-1).setProbReproducci�n(Math.random()*60);
		((Herb�voro) animales.get(animales.size()-1)).setMovimiento(Math.random()*20 - 10);
	}

	public double getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(double movimiento) {
		this.probAlimentaci�n += movimiento;
	}
	
}
