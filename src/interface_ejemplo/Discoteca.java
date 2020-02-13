package interface_ejemplo;

import java.util.*;

public class Discoteca {
	static ArrayList<Baile> objetos = new ArrayList<Baile>();
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("(1) Persona\n(2) Canario\n");
		String resp = scr.nextLine();
		switch (resp) {
		case "1":
			objetos.add(new Persona());
			break;
		case "2":
			objetos.add(new Canario());
			break;
		}
		hacerCantar((Canto) objetos.get(0));
		hacerBailar((Baile) objetos.get(0));
	}

	public static void hacerCantar(Canto a) {
		a.Cantar();
	}

	public static void hacerBailar(Baile a) {
		a.Bailar();
	}

}
