package guía_1;

import java.util.Scanner;

public class E2 {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		int i, x = 4, y = 4;
		int[][] reloj = new int[x][y];
		reloj[3][0] = 0;
		System.out.println("Ingrese los datos solicitados para el cálculo de horario:");
		System.out.println("1: Segundos\n2: Minutos\n3: Horas\n");
		for (i = 0; i < x - 1; i++) {
			System.out.print(i + 1 + ": ");
			reloj[i][0] = scr.nextInt();
			reloj[i][3] = reloj[i][0];
		}
		for (i = 0; i < x - 1; i++) {
			switch (i) {
			case 0:
				reloj[i][3] += 1;
				reloj[i][1] = reloj[i][3] / 60;
				if (reloj[i][1] > 0)
					reloj[i + 1][3] += reloj[i][1];
				reloj[i][2] = reloj[i][3] % 60;
				reloj[i][3] = reloj[i][2];
				break;
			case 1:
				reloj[i][1] = reloj[i][3] / 60;
				if (reloj[i][1] > 0)
					reloj[i + 1][3] += reloj[i][1];
				reloj[i][2] = reloj[i][3] % 60;
				reloj[i][3] = reloj[i][2];
				break;
			case 2:
				reloj[i][1] = reloj[i][3] / 24;
				if (reloj[i][1] > 0)
					reloj[i + 1][3] += reloj[i][1];
				reloj[i][2] = reloj[i][3] % 24;
				reloj[i][3] = reloj[i][2];
				break;
			}
		}
		System.out.println("\nDentro de 1 segundo más, el nuevo horario será:\nDD : HH : MM : SS\n");
		for (i = x - 1; i >= 0; i--) {
			System.out.print(reloj[i][3]);
			if (i != 0)
				System.out.print(" : ");
		}
	}
}
