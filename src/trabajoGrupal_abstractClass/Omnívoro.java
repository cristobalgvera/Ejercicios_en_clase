package trabajoGrupal_abstractClass;

public class Omn�voro extends Animal {

	public Omn�voro() {
		super();
	}

	public Omn�voro(int tipoAlimentaci�n, double probAlimentaci�n, double probReproducci�n, boolean alimentaci�n,
			boolean reproducci�n) {
		super(tipoAlimentaci�n, probAlimentaci�n, probReproducci�n, alimentaci�n, reproducci�n);
	}

	public Omn�voro(int tipoAlimentaci�n) {
		super(tipoAlimentaci�n);
	}
	
	public void crearOtro() {
		animales.add(new Omn�voro(0));
		animales.get(animales.size()-1).setProbAlimentaci�n(Math.random()*65);
		animales.get(animales.size()-1).setProbReproducci�n(Math.random()*70);
	}

}
