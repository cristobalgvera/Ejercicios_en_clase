package ej_presentaciones;

import java.util.Scanner;
import java.util.ArrayList;

public class Array_Int {
	static Scanner scr = new Scanner(System.in);
	static ArrayList<Integer> numbers = new ArrayList<Integer>();

	public static void main(String[] args) {
		int i, dim;
		System.out.println("�Cu�ntos n�meros quiere generar?");
		dim = (int) scr.nextDouble();
		System.out.println();
		for (i = 0; i < dim; i++) {
			numbers.add((int) (Math.random() * 60));
			System.out.println(i + 1 + ": " + numbers.get(i));
		}
	}
}
