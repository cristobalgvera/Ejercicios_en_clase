package guía_3;

import java.util.Scanner;

public class E3 {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		boolean intValidation = true;
		double colums;
		do {
			if (intValidation == false) {
				System.out.println("\n*******************************************");
				System.out.println("Cantidad de columnas incorrecta, reintente:");
				System.out.println("*******************************************\n");
			}
			System.out.print("Ingrese la cantidad de columnas de la matriz: ");
			colums = scr.nextDouble();
			intValidation = numericIntValidation(colums, 1);
		} while (intValidation == false);
		int[][] zeroToTen = new int[5][(int) colums];
		matrixFill(zeroToTen);
		showMatrix(zeroToTen);
	}

	static void showMatrix(int[][] matrix) {
		System.out.println("\nMatriz generada aleatóreamente:\n");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}
	}

	static void matrixFill(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 11);
			}
		}
	}

	public static boolean numericIntValidation(Double number, int minNumber) {
		boolean validation = false;
		if (number >= minNumber && number % 1 == 0) // Validación para saber que el número comple
													// las condiciones
			validation = true;
		return validation;
	}

}
