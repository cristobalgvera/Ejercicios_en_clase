package trabajoGrupal_abstractClass;

public class Omnívoro extends Animal {

	public Omnívoro() {
		super();
	}

	public Omnívoro(int tipoAlimentación, double probAlimentación, double probReproducción, boolean alimentación,
			boolean reproducción) {
		super(tipoAlimentación, probAlimentación, probReproducción, alimentación, reproducción);
	}

	public Omnívoro(int tipoAlimentación) {
		super(tipoAlimentación);
	}
	
	public void crearOtro() {
		animales.add(new Omnívoro(0));
		animales.get(animales.size()-1).setProbAlimentación(Math.random()*65);
		animales.get(animales.size()-1).setProbReproducción(Math.random()*70);
	}

}
