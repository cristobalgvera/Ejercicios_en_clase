package ej_presentaciones;

import java.util.Scanner;

public class Edades_Turno {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int edad, i, j, x = 3, m = 10, t = 7, n = 5;
		double[][] prom = new double[x][2];
		double aux = 0, suma = 0;
		System.out.println("Ingrese los valores de edad por turno:\n\nTurno mañana:");
		for (i = 0; i < m; i++) {
			System.out.print((i + 1) + ": ");
			edad = scr.nextInt();
			suma += edad;
		}
		prom[0][0] = suma / m;
		suma = 0;
		prom[0][1] = prom[0][0];
		System.out.println("\nTurno tarde:");
		for (i = 0; i < t; i++) {
			System.out.print((i + 1) + ": ");
			edad = scr.nextInt();
			suma += edad;
		}
		prom[1][0] = suma / t;
		suma = 0;
		prom[1][1] = prom[1][0];
		System.out.println("\nTurno noche:");
		for (i = 0; i < n; i++) {
			System.out.print((i + 1) + ": ");
			edad = scr.nextInt();
			suma += edad;
		}
		prom[2][0] = suma / n;
		prom[2][1] = prom[2][0];
		System.out.println("\n\nDetalle de edades promedio por turno:\n");
		for (i = 0; i < x; i++) {
			switch (i) {
			case 0:
				System.out.print("Mañana: ");
				break;
			case 1:
				System.out.print("Tarde: ");
				break;
			case 2:
				System.out.print("Noche: ");
				break;
			}
			System.out.println(prom[i][0]);
		}
		for (i = 0; i < x - 1; i++) {
			for (j = i + 1; j < x; j++) {
				if (prom[i][1] > prom[j][1]) {
					aux = prom[i][1];
					prom[i][1] = prom[j][1];
					prom[j][1] = aux;
				}
			}
		}
//		for (i = 0; i < 2; i++) {
//			for (j = 0; j < x; j++) {
//				System.out.print(prom[j][i] + "  ");
//			}
//			System.out.println();
//		}
		for (i = 0; i < x; i++) {
			aux = prom[x - 1][1] - prom[i][0];
			if (aux == 0) {
				aux = i;
				break;
			}
		}
		System.out.print("\nTurno con mayor promedio de edades: Turno de ");
		switch ((int) aux) {
		case 0:
			System.out.println("Mañana");
			break;
		case 1:
			System.out.println("Tarde");
			break;
		case 2:
			System.out.println("Noche");
			break;
		}
	}

}
