package metodos_ejemplo3;

import java.util.*;

public class Principal {
	static Scanner scr = new Scanner(System.in);
	static Calculator operation;

	public static void main(String[] args) {
		System.out.print("Ingrese el primer número a operar: ");
		double num1 = scr.nextDouble();
		System.out.print("Ingrese el segundo número a operar: ");
		double num2 = scr.nextDouble();
		operation = new Calculator(num1, num2);
		System.out.println();
		operation.showOperation();
	}

}
