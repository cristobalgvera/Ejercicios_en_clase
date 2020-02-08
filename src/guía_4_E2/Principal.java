package guía_4_E2;

import java.util.*;

public class Principal {
	static Scanner scr = new Scanner(System.in);
	static List<Products> list = new ArrayList<Products>();

	public static void main(String[] args) {
		System.out.println("INVENTARIO DE PRODUCTOS:\n");
		boolean answerBoolean = false;
		String answer;
		int aux = 0;
		do {
			list.add(new Products());
			System.out.print("Producto: ");
			list.get(aux).setName(scr.nextLine());
			System.out.print("Precio: ");
			list.get(aux).setPrice(scr.nextInt());
			System.out.print("Código: ");
			list.get(aux).setCode(scr.nextInt());
			scr.nextLine();
			System.out.println("\n¿Desea agregar más productos? (S/N)");
			answer = scr.nextLine();
			if (answer.compareTo("s") == 0 || answer.compareTo("S") == 0) {
				answerBoolean = true;
			} else {
				answerBoolean = false;
			}
			System.out.println();
			aux++;
		} while (answerBoolean == true);
		System.out.println("INVENTARIO DE PRODUCTOS:\n");
		System.out.println("Producto\tPrecio\t\tCódigo\n");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}

}
