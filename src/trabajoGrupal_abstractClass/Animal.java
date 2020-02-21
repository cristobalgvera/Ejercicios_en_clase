package trabajoGrupal_abstractClass;

import java.util.*;

public abstract class Animal implements Reproducible, Alimentable {
	public static List<Animal> animales = new ArrayList<Animal>();

	protected int tipoAlimentación;
	protected double probAlimentación, probReproducción;
	protected boolean alimentación, reproducción;
	static int carnívoros, herbívoros, omnívoros, población;

	public Animal() {
	}

	public Animal(int tipoAlimentación) {
		this.tipoAlimentación = tipoAlimentación;
	}

	public Animal(int tipoAlimentación, double probAlimentación, double probReproducción, boolean alimentación,
			boolean reproducción) {
		this.tipoAlimentación = tipoAlimentación;
		this.probAlimentación = probAlimentación;
		this.probReproducción = probReproducción;
		this.alimentación = alimentación;
		this.reproducción = reproducción;
	}

	public void Reproducir() {
		setReproducción(Math.random() * 99 + 1 < getProbReproducción());
	}

	public void Alimentar() {
		setAlimentación(Math.random() * 99 + 1 < getProbAlimentación());
	}

	public int getTipoAlimentación() {
		return tipoAlimentación;
	}

	public void setTipoAlimentación(int tipoAlimentación) {
		this.tipoAlimentación = tipoAlimentación;
	}

	public double getProbAlimentación() {
		return probAlimentación;
	}

	public void setProbAlimentación(double probAlimentación) {
		this.probAlimentación = probAlimentación;
	}

	public double getProbReproducción() {
		return probReproducción;
	}

	public void setProbReproducción(double probReproducción) {
		this.probReproducción = probReproducción;
	}

	public boolean isAlimentación() {
		return alimentación;
	}

	public void setAlimentación(boolean alimentación) {
		this.alimentación = alimentación;
	}

	public boolean isReproducción() {
		return reproducción;
	}

	public void setReproducción(boolean reproducción) {
		this.reproducción = reproducción;
	}

	static String cantidadAnimales() {
		int carnívorosAnterior = carnívoros, herbívorosAnterior = herbívoros, omnívorosAnterior = omnívoros, poblaciónAnterior = población;
		carnívoros = 0;
		herbívoros = 0;
		omnívoros = 0;
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i).getTipoAlimentación() == 1) {
				herbívoros++;
			} else if (animales.get(i).getTipoAlimentación() == -1) {
				carnívoros++;
			} else {
				omnívoros++;
			}
		}
		población = herbívoros + carnívoros + omnívoros;
		StringBuilder sb = new StringBuilder();
		sb.append("POBLACIÓN:    \t" + animales.size() + " \t(" + (población - poblaciónAnterior) + ")");
		sb.append("\n\nCarnívoros: \t" + carnívoros + " \t(" + (carnívoros - carnívorosAnterior) + ")");
		sb.append("\nHerbívoros:   \t" + herbívoros + " \t(" + (herbívoros - herbívorosAnterior) + ")");
		sb.append("\nOmnívoros:    \t" + omnívoros + " \t(" + (omnívoros - omnívorosAnterior) + ")");
		return sb.toString();
	}
}
