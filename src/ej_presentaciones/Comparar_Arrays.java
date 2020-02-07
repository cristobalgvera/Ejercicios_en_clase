package ej_presentaciones;

import java.util.Arrays;

public class Comparar_Arrays {

	public static void main(String[] args) {
		int i, a = 0;
		int[] numbers = new int[5];
		int[] numbers1 = new int[5];
		for (i = 0; i < numbers.length; i++) {
			numbers[i] = a;
			numbers1[i] = a;
			a++;
		}
		System.out.print(Arrays.equals(numbers, numbers1));
	}

}
