package trabajoGrupal_proyectoM�dulo;

import java.util.Date;

public class Carro implements Posicionable {
	protected int cantidadOcupantes, TAMA�O, n�meroImpactos, posici�n[][];
	protected Date fechaIngreso;
	protected char TIPO;

	// Representa a la clase padre de los carros {Kromi, Caguano y Trupalla}. Los
	// atributos importantes para el programa son: {TAMA�O, TIPO, 2posici�n[][] y
	// n�meroImpactos}

	public Carro(int cantidadOcupantes, int[][] posici�n, Date fechaIngreso) {
		this.cantidadOcupantes = cantidadOcupantes;
		this.posici�n = posici�n;
		this.fechaIngreso = new Date();
		this.n�meroImpactos = 0;
	}

	public Carro() {
		this.n�meroImpactos = 0;
	}

	// M�todos heredados de la interfaz que setean la posici�n del huevo en funci�n
	// de lo determinado de manera aleat�rea por el sistema

	@Override
	public boolean comprobarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int fila = posici�n[0][0] - 1, columna = posici�n[0][1] - 1;
		try {
			for (int i = fila; i < fila + TAMA�O; i++) {
				if (grilla[i][columna] != 0) {
					return false;
				}
			}
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public char[][] asignarPosici�n(char[][] grilla, int[][] posici�n, int TAMA�O) {
		int[][] posici�nFinal = new int[TAMA�O][2];
		int fila = posici�n[0][0] - 1, columna = posici�n[0][1] - 1;
		for (int i = fila, j = 0; i < fila + TAMA�O; i++, j++) {
			posici�nFinal[j][0] = i;
			posici�nFinal[j][1] = columna;
			grilla[i][columna] = getTipo();
		}
		setPosici�n(posici�nFinal);
		return grilla;
	}

	// Representa el impacto de un proyectil (huevo) con el carro. Al alcanzarse el
	// tama�o del objeto en cuesti�n, este es "destruido"

	public void Impactar() {
		setN�meroImpactos(getN�meroImpactos() + 1);
	}

	public int getCantidadOcupantes() {
		return cantidadOcupantes;
	}

	public void setCantidadOcupantes(int cantidadOcupantes) {
		this.cantidadOcupantes = cantidadOcupantes;
	}

	public int[][] getPosici�n() {
		return posici�n;
	}

	public void setPosici�n(int[][] posici�n) {
		this.posici�n = posici�n;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public char getTipo() {
		return TIPO;
	}

	public void setTipo(char tipo) {
		this.TIPO = tipo;
	}

	public int getTama�o() {
		return TAMA�O;
	}

	public void setTama�o(int tama�o) {
		this.TAMA�O = tama�o;
	}

	public int getN�meroImpactos() {
		return n�meroImpactos;
	}

	public void setN�meroImpactos(int n�meroImpactos) {
		this.n�meroImpactos = n�meroImpactos;
	}

	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\nCantidad de ocupantes: \t" + getCantidadOcupantes());
		builder.append("\nImpactos recibidos:    \t" + getN�meroImpactos());
		builder.append("\nFecha de ingreso:      \t" + getFechaIngreso());
		builder.append("\nPosici�n:              \t");
		for (int i = 0; i < getTama�o(); i++) {
			builder.append("( " + (getPosici�n()[i][0] + 1) + " , " + (getPosici�n()[i][1] + 1) + " ) ");
		}
		return builder.toString();
	}

}
