package trabajoGrupal_proyectoMódulo;

import java.util.Date;

public class Kromi extends Carro {
	private int añoFabricación;
	private String marca;

	public Kromi(int cantidadOcupantes, int[][] posición, Date fechaIngreso, int añoFabricación, String marca) {
		super(cantidadOcupantes, posición, fechaIngreso);
		this.añoFabricación = añoFabricación;
		this.marca = marca;
		this.TAMAÑO = 3;
		this.TIPO = 'K';
	}

	public Kromi() {
		super();
		this.TAMAÑO = 3;
		this.TIPO = 'K';
	}

	public int getAñoFabricación() {
		return añoFabricación;
	}

	public void setAñoFabricación(int añoFabricación) {
		this.añoFabricación = añoFabricación;
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
		int posición = builder.indexOf("\nPosición");
		builder.insert(posición, "\nAño de fabricación:    \t" + getAñoFabricación());
		builder.insert(posición, "\nMarca:                 \t" + getMarca());
		return builder.toString();
	}

}
