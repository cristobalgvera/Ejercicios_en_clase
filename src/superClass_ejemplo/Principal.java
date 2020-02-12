package superClass_ejemplo;

import java.util.*;

public class Principal {
	static Scanner scr = new Scanner(System.in);
	static ArrayList<Animal> animals = new ArrayList<Animal>();

	public static void main(String[] args) {
		double aux;
		for (int i = 0; i < (int) (Math.random() * 50 + 1); i++) {
			aux = Math.random();
			if (aux > 0.5) {
				animals.add(new Terrestre());
				animals.get(i).setName(Terrestre.nombreAnimal());
				((Terrestre) animals.get(i)).setLegs((int) (Math.random() * 2 + 1) * 2);
			} else {
				animals.add(new Acuático());
				animals.get(i).setName(Acuático.nombreAnimal());
				((Acuático) animals.get(i)).setFins((int) (Math.random() * 2 + 2));
			}
			animals.get(i).setWeight(Math.round((Math.random() * 300 + 10) * 100d) / 100d);
			animals.get(i).setYears((int) (Math.random() * 100) + 1);
			animals.get(i).setSex((int) (Math.random() * 2));
			animals.get(i).setZone((int) (Math.random() * 5 + 1));
		}
		System.out.println("LISTADO DE ANIMALES:\n");
		System.out.println("Animal\t\tPeso (kg)\tEdad\t\tUbicación\tSexo\t\t\n");
		for (int i = 0; i < animals.size(); i++) {
			System.out.println(animals.get(i).toString());
		}
	}

}
