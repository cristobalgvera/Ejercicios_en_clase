package trabajoGrupal_proyectoMódulo;

import java.util.Date;

public class Trupalla extends Carro {
	private int nivelArmadura;
	private String conductor;

	public Trupalla(int cantidadOcupantes, int[][] posición, Date fechaIngreso, int nivelArmadura, String conductor) {
		super(cantidadOcupantes, posición, fechaIngreso);
		this.nivelArmadura = nivelArmadura;
		this.conductor = conductor;
		this.TAMAÑO = 1;
		this.TIPO = 'T';
	}

	public Trupalla() {
		super();
		this.TAMAÑO = 1;
		this.TIPO = 'T';
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TRUPALLA\n");
		builder.append(super.toString());
		int posición = builder.indexOf("\nPosición");
		builder.insert(posición, "\nNivel de armadura:     \t" + getNivelArmadura());
		builder.insert(posición, "\nConductor:             \t" + getConductor());
		return builder.toString();
	}

}
