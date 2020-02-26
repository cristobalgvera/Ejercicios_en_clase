package trabajoGrupal_proyectoM�dulo;

import java.util.Date;

public class Kromi extends Carro {
	private int a�oFabricaci�n;
	private String marca;

	public Kromi(int cantidadOcupantes, int[][] posici�n, Date fechaIngreso, int a�oFabricaci�n, String marca) {
		super(cantidadOcupantes, posici�n, fechaIngreso);
		this.a�oFabricaci�n = a�oFabricaci�n;
		this.marca = marca;
		this.TAMA�O = 3;
		this.TIPO = 'K';
	}

	public Kromi() {
		super();
		this.TAMA�O = 3;
		this.TIPO = 'K';
	}

	public int getA�oFabricaci�n() {
		return a�oFabricaci�n;
	}

	public void setA�oFabricaci�n(int a�oFabricaci�n) {
		this.a�oFabricaci�n = a�oFabricaci�n;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("KROMI\n");
		builder.append(super.toString());
		int posici�n = builder.indexOf("\nPosici�n");
		builder.insert(posici�n, "\nA�o de fabricaci�n:    \t" + getA�oFabricaci�n());
		builder.insert(posici�n, "\nMarca:                 \t" + getMarca());
		return builder.toString();
	}

}
