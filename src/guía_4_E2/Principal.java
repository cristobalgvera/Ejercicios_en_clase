package guía_4_E2;

import java.util.*;

public class Principal {
	static Scanner scr = new Scanner(System.in);
	static List<Products> list = new ArrayList<Products>();

//	static String name;
//	static int price, code;

	public static void main(String[] args) {
		System.out.println("INVENTARIO DE PRODUCTOS:\n");
		System.out.print("Producto: ");
		Products.setName(scr.nextLine());
		System.out.print("Precio: ");
		Products.setPrice(scr.nextInt());
	}

}
