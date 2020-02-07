package ej_presentaciones;

import java.util.Scanner;

public class Tiempo_Corredores {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		double dim1;
		int dim, i;
		double[] tiempos;
		System.out.println("¿Cuántos atletas participarán?");
		dim1 = scr.nextDouble();
		while (dim1 < 1 || dim1 / (int) dim1 != 1) {
			System.out.println("\nNúmero ingresado no es válido, reintente");
			dim1 = scr.nextDouble();
		}
		dim = (int) dim1;
		tiempos = new double[dim];
		System.out.println("DETALLE DE TIEMPOS POR ATLETA EN SEGUNDOS:\n");
		for (i = 0; i < dim; i++) {
			tiempos[i] = Math.random() * 5 + 7;
			System.out.println(i + 1 + ": " + tiempos[i]);
		}
		int aux = dim - 1, aux2 = aux;
		for (i = 0; i < dim; i++) {
			if (tiempos[i] < tiempos[aux])
				aux = i;
			if (tiempos[i] > tiempos[aux2])
				aux2 = i;
		}
		System.out.print("\nEl atleta con mejor tiempo fue el número " + (aux + 1));
		System.out.print("\nEl atleta con peor tiempo fue el número " + (aux2 + 1));
	}

}
