package trabajoGrupal_abstractClass;

public class Carn�voro extends Animal {
	private double bonusAlimento;

	public Carn�voro() {
		super();
	}

	public Carn�voro(int tipoAlimentaci�n) {
		super(tipoAlimentaci�n);
	}

	public Carn�voro(int tipoAlimentaci�n, double probAlimentaci�n, double probReproducci�n, boolean alimentaci�n,
			boolean reproducci�n, double bonusAlimento) {
		super(tipoAlimentaci�n, probAlimentaci�n, probReproducci�n, alimentaci�n, reproducci�n);
		this.bonusAlimento = bonusAlimento;
	}

	public void crearOtro() {
		animales.add(new Carn�voro(-1));
		animales.get(animales.size()-1).setProbAlimentaci�n(Math.random()*60);
		animales.get(animales.size()-1).setProbReproducci�n(Math.random()*80);
		((Carn�voro) animales.get(animales.size()-1)).setBonusAlimento(Math.random()*20 - 10);
	}

	public double getBonusAlimento() {
		return bonusAlimento;
	}

	public void setBonusAlimento(double bonusAlimento) {
		this.probAlimentaci�n += bonusAlimento;
	}

}
