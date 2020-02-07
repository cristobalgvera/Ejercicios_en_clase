package guía_2;

import java.util.Scanner;
import java.util.ArrayList;

public class E4 {
	static Scanner scr = new Scanner(System.in);
	static ArrayList<Double> est = new ArrayList<Double>();

	public static void main(String[] args) {
		int aux = 0, i;
		double num, prom = 0;
		System.out.println("Ingrese las estaturas del atleta señalado en cm: (0 para finalizar)\n");
		do {
			System.out.print(aux + 1 + ": ");
			num = scr.nextDouble();
			if (num != 0) {
				est.add(num);
				aux++;
			}
		} while (num != 0);
		if (est.get(0) != 0) {
			num = est.size();
			for (i = 0; i < num; i++) {
				prom += est.get(i);
			}
			prom /= num;
			System.out.println("\n\nEl promedio de estaturas es: " + prom);
		} else {
			System.out.println("\n\nNo ha ingresado valores, gracias por su participación");
		}
	}

}
