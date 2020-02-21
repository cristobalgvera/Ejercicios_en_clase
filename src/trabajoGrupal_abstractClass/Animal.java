package trabajoGrupal_abstractClass;

import java.util.*;

public abstract class Animal implements Reproducible, Alimentable {
	public static List<Animal> animales = new ArrayList<Animal>();

	protected int tipoAlimentaci�n;
	protected double probAlimentaci�n, probReproducci�n;
	protected boolean alimentaci�n, reproducci�n;
	static int carn�voros, herb�voros, omn�voros, poblaci�n;

	public Animal() {
	}

	public Animal(int tipoAlimentaci�n) {
		this.tipoAlimentaci�n = tipoAlimentaci�n;
	}

	public Animal(int tipoAlimentaci�n, double probAlimentaci�n, double probReproducci�n, boolean alimentaci�n,
			boolean reproducci�n) {
		this.tipoAlimentaci�n = tipoAlimentaci�n;
		this.probAlimentaci�n = probAlimentaci�n;
		this.probReproducci�n = probReproducci�n;
		this.alimentaci�n = alimentaci�n;
		this.reproducci�n = reproducci�n;
	}

	public void Reproducir() {
		setReproducci�n(Math.random() * 99 + 1 < getProbReproducci�n());
	}

	public void Alimentar() {
		setAlimentaci�n(Math.random() * 99 + 1 < getProbAlimentaci�n());
	}

	public int getTipoAlimentaci�n() {
		return tipoAlimentaci�n;
	}

	public void setTipoAlimentaci�n(int tipoAlimentaci�n) {
		this.tipoAlimentaci�n = tipoAlimentaci�n;
	}

	public double getProbAlimentaci�n() {
		return probAlimentaci�n;
	}

	public void setProbAlimentaci�n(double probAlimentaci�n) {
		this.probAlimentaci�n = probAlimentaci�n;
	}

	public double getProbReproducci�n() {
		return probReproducci�n;
	}

	public void setProbReproducci�n(double probReproducci�n) {
		this.probReproducci�n = probReproducci�n;
	}

	public boolean isAlimentaci�n() {
		return alimentaci�n;
	}

	public void setAlimentaci�n(boolean alimentaci�n) {
		this.alimentaci�n = alimentaci�n;
	}

	public boolean isReproducci�n() {
		return reproducci�n;
	}

	public void setReproducci�n(boolean reproducci�n) {
		this.reproducci�n = reproducci�n;
	}

	static String cantidadAnimales() {
		int carn�vorosAnterior = carn�voros, herb�vorosAnterior = herb�voros, omn�vorosAnterior = omn�voros, poblaci�nAnterior = poblaci�n;
		carn�voros = 0;
		herb�voros = 0;
		omn�voros = 0;
		for (int i = 0; i < animales.size(); i++) {
			if (animales.get(i).getTipoAlimentaci�n() == 1) {
				herb�voros++;
			} else if (animales.get(i).getTipoAlimentaci�n() == -1) {
				carn�voros++;
			} else {
				omn�voros++;
			}
		}
		poblaci�n = herb�voros + carn�voros + omn�voros;
		StringBuilder sb = new StringBuilder();
		sb.append("POBLACI�N:    \t" + animales.size() + " \t(" + (poblaci�n - poblaci�nAnterior) + ")");
		sb.append("\n\nCarn�voros: \t" + carn�voros + " \t(" + (carn�voros - carn�vorosAnterior) + ")");
		sb.append("\nHerb�voros:   \t" + herb�voros + " \t(" + (herb�voros - herb�vorosAnterior) + ")");
		sb.append("\nOmn�voros:    \t" + omn�voros + " \t(" + (omn�voros - omn�vorosAnterior) + ")");
		return sb.toString();
	}
}
