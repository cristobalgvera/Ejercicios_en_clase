package trabajoGrupal_abstractClass;

public class Herbívoro extends Animal {
	private double movimiento;

	public Herbívoro() {
		super();
	}

	public Herbívoro(int tipoAlimentación, double probAlimentación, double probReproducción, boolean alimentación,
			boolean reproducción) {
		super(tipoAlimentación, probAlimentación, probReproducción, alimentación, reproducción);
	}

	public Herbívoro(int tipoAlimentación) {
		super(tipoAlimentación);
	}
	
	public void crearOtro() {
		animales.add(new Herbívoro(1));
		animales.get(animales.size()-1).setProbAlimentación(Math.random()*70);
		animales.get(animales.size()-1).setProbReproducción(Math.random()*60);
		((Herbívoro) animales.get(animales.size()-1)).setMovimiento(Math.random()*20 - 10);
	}

	public double getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(double movimiento) {
		this.probAlimentación += movimiento;
	}
	
}
