package guía_2;

import java.util.ArrayList;
import java.util.Random;

public class E7 {
	static ArrayList<Integer> horas = new ArrayList<Integer>();
	static Random ran = new Random();

	public static void main(String[] args) {
		int i, suma_horas = 0, pago = 2000, sueldo = 0;
		for (i = 0; i < 7; i++) {
			horas.add(4 + ran.nextInt(6));
			suma_horas += horas.get(i);
			System.out.println(i + 1 + ": " + horas.get(i));
		}
		sueldo = suma_horas * pago;
		System.out.println("\nDETALLE:\n\nTotal horas trabajadas: " + suma_horas);
		System.out.println("Sueldo semanal a pagar: " + sueldo);
		System.out.println("\nACLARACIONES:\n");
		if (suma_horas > 45) {
			System.out.println("* El trabajador trabaja más horas de las establecidas por ley (" + (suma_horas - 45)
					+ " horas más)");
		}
		if (sueldo < 76250) {
			System.out.println("* El trabajado gana menos del sueldo semanal establecido por ley ($" + (76250 - sueldo)
					+ " menos)");
		}
		if (suma_horas <= 45 && sueldo >= 76250)
			System.out.print("No hay aclaraciones");
	}

}
