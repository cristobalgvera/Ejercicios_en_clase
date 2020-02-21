package trabajoGrupal_abstractClass;

public class Carnívoro extends Animal {
	private double bonusAlimento;

	public Carnívoro() {
		super();
	}

	public Carnívoro(int tipoAlimentación) {
		super(tipoAlimentación);
	}

	public Carnívoro(int tipoAlimentación, double probAlimentación, double probReproducción, boolean alimentación,
			boolean reproducción, double bonusAlimento) {
		super(tipoAlimentación, probAlimentación, probReproducción, alimentación, reproducción);
		this.bonusAlimento = bonusAlimento;
	}

	public void crearOtro() {
		animales.add(new Carnívoro(-1));
		animales.get(animales.size()-1).setProbAlimentación(Math.random()*60);
		animales.get(animales.size()-1).setProbReproducción(Math.random()*80);
		((Carnívoro) animales.get(animales.size()-1)).setBonusAlimento(Math.random()*20 - 10);
	}

	public double getBonusAlimento() {
		return bonusAlimento;
	}

	public void setBonusAlimento(double bonusAlimento) {
		this.probAlimentación += bonusAlimento;
	}

}
