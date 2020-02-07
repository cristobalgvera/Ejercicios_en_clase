package guía_3;

import java.util.*;

public class E4 {
	static Scanner scr = new Scanner(System.in);
	static ArrayList<Double> numbers = new ArrayList<Double>();

	public static void main(String[] args) {
		System.out.println("NÚMEROS EN DETALLE\n\nIngrese todos los números que quiera, ingrese -1 para finalizar\n");
		int aux = 0;
		double number = 0;
		do {
			aux++;
			System.out.print(aux + ": ");
			number = scr.nextDouble();
			if (number != -1)
				numbers.add(number);
		} while (number != -1);
		System.out.println("\nNÚMEROS EN DETALLE\n");
		Operations(numbers);
	}

	public static void Operations(ArrayList<Double> numbers) {
		Iterator<Double> itr = numbers.iterator();
		int higher = 0, lower = 0, aux = 0;
		double positiveSum = 0, negativeSum = 0, sum = 0, average = 0;
		while (itr.hasNext() == true) {
			itr.next();
			sum += numbers.get(aux);
			if (numbers.get(aux) > 0) {
				positiveSum += numbers.get(aux);
			} else {
				negativeSum += numbers.get(aux);
			}
			if (numbers.get(aux) > numbers.get(higher))
				higher = aux;
			if (numbers.get(aux) <= numbers.get(lower))
				lower = aux;
			aux++;
		}
		if (numbers.size() != 0)
			average = sum / numbers.size();
		System.out.println("Mayor número:		\t" + numbers.get(higher));
		System.out.println("Menor número:		\t" + numbers.get(lower));
		System.out.println("Suma total:		\t" + sum);
		System.out.println("Suma de positivos:	\t" + positiveSum);
		System.out.println("Suma de negativos:	\t" + negativeSum);
		System.out.println("Promedio total:		\t" + average);
	}

}
