package guía_1;

import java.util.Scanner;

public class E3 {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		double horas, horas_extra, pago_neto, pago_liquido, salud = 0.07, hora_maxima = 40, hora_minima = 25;
		int extra_normal = 16000, hora_extra = 20000, hora_normal = 10000, hora_def = 9000, r = 2;
		System.out.println("Ingrese la cantidad de horas trabajadas");
		horas = Double.parseDouble(scr.nextLine());
		if (horas > hora_extra) {
			r = 0;
		} else if (horas < hora_minima) {
			r = 1;
		}
		switch (r) {
		case 0:
			horas_extra = horas - hora_maxima;
			pago_neto = horas_extra * hora_extra + extra_normal * hora_maxima;
			break;
		case 1:
			pago_neto = hora_def * horas;
			break;
		default:
			pago_neto = hora_normal * horas;
			break;
		}
		pago_liquido = pago_neto * (1 - salud);
		System.out.println("\n\n Sueldo líquido a pagar: " + (int) pago_liquido);
	}

}
