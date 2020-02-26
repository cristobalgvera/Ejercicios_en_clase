package trabajoGrupal_proyectoM�dulo;

import java.util.Date;

public class Trupalla extends Carro {
	private int nivelArmadura;
	private String conductor;

	public Trupalla(int cantidadOcupantes, int[][] posici�n, Date fechaIngreso, int nivelArmadura, String conductor) {
		super(cantidadOcupantes, posici�n, fechaIngreso);
		this.nivelArmadura = nivelArmadura;
		this.conductor = conductor;
		this.TAMA�O = 1;
		this.TIPO = 'T';
	}

	public Trupalla() {
		super();
		this.TAMA�O = 1;
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
		int posici�n = builder.indexOf("\nPosici�n");
		builder.insert(posici�n, "\nNivel de armadura:     \t" + getNivelArmadura());
		builder.insert(posici�n, "\nConductor:             \t" + getConductor());
		return builder.toString();
	}

}
