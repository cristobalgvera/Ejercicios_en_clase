package gu�a_3;

import java.util.Scanner;

public class E1 {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("CALCULADORA SIMPLE\nLogin");
		int attemps = login(); // Obtenemos el n�mero de intentos realizados para cerrar el programa en caso de
								// ser necesario
		if (attemps > 3) {
			System.out.println("\nN�mero de intentos m�ximo superado, su sesi�n ha sido bloqueada");
			System.exit(attemps);
		}
		calculator(); // Todas las funciones que opera la calculadora dentro de la clase
		System.out.print("\nGracias por tu participaci�n");
	}

	public static boolean calculator() {
		boolean calculatorClose = true; // Regula el cierre del programa solicitado por el usuario
		boolean numericIntBoolean = false; // Regula el ingreso de variables enteras para el men� de opciones
		int attemps = 0; // Ayuda visual para el usuario y su cantidad de operaciones realizadas
		double firstNumber = 0, secondNumber = 0, operation = 1; // Variables ingresadas por el usuario
		while (calculatorClose == true) { // While dependiente de la respuesta del usuario para un nuevo uso
			attemps++;
			System.out.println("\nN�mero de operaci�n: " + attemps);
			System.out.println("Ingrese los n�meros a operar:\n");
			System.out.print("1: ");
			firstNumber = scr.nextDouble();
			System.out.print("2: ");
			secondNumber = scr.nextDouble();
			while (numericIntBoolean == false) {
				System.out.println("\n(1) Suma\n(2) Resta\n(3) Multiplicaci�n\n(4) Divisi�n");
				System.out.print("\nSeleccione el tipo de operaci�n: ");
				operation = scr.nextDouble();
				numericIntBoolean = numericIntValidation(operation, 1, 4); // Validamos que el n�mero ingresado es
																			// correcto de acuerdo al men� de opciones
				if (numericIntBoolean == false)
					System.out.println("Opci�n ingresada no es v�lida, reintente:");
			}
			double result = 0; // Resultado de la operaci�n solicitada por el usuario
			switch ((int) operation) { // Realizamos la operaci�n que solicita el usuario
			case 1:
				result = sum(firstNumber, secondNumber);
				System.out.println("\n" + firstNumber + " + " + secondNumber + " = " + result);
				break;
			case 2:
				result = subtraction(firstNumber, secondNumber);
				System.out.println("\n" + firstNumber + " - " + secondNumber + " = " + result);
				break;
			case 3:
				result = multiplication(firstNumber, secondNumber);
				System.out.println("\n" + firstNumber + " * " + secondNumber + " = " + result);
				break;
			case 4:
				if (secondNumber != 0) { // Validamos que la divisi�n por cero
					result = division(firstNumber, secondNumber);
					System.out.println("\n" + firstNumber + " / " + secondNumber + " = " + result);
				} else {
					System.out.println("\nMathError - No puedes dividir por cero");
				}
				break;
			}
			numericIntBoolean = false; // Reiniciamos el ingreso de variables enteras
			scr.nextLine(); // Quitamos posibles l�neas innecesarias
			calculatorClose = close(); // Preguntamos por el cierre del programa al usuario
		}
		return calculatorClose;
	}

	public static boolean close() {
		System.out.println("\n�Desea realizar otra operaci�n? (S/N)");
		String closeAnswer = scr.nextLine();
		if (closeAnswer.compareTo("s") == 0 || closeAnswer.compareTo("S") == 0) { // Validamos la respuesta del usuario
			return true;
		} else {
			return false;
		}
	}

	public static double division(double firstNumber, double secondNumber) {
		double division = firstNumber / secondNumber;
		return division;
	}

	public static double multiplication(double firstNumber, double secondNumber) {
		double multiplication = firstNumber * secondNumber;
		return multiplication;
	}

	public static double subtraction(double firstNumber, double secondNumber) {
		double subtraction = firstNumber - secondNumber;
		return subtraction;
	}

	public static double sum(double firstNumber, double secondNumber) {
		double sum = firstNumber + secondNumber;
		return sum;
	}

	public static boolean numericIntValidation(Double number, int minNumber, int maxNumber) {
		boolean validation = false;
		if (number >= minNumber && number <= maxNumber && number % 1 == 0) // Validaci�n para saber que el n�mero comple
																			// las condiciones
			validation = true;
		return validation;
	}

	public static int login() {
		boolean validationReturn = false;
		String realUser = "1000";
		String realPass = "0000";
		int attemps = 1;
		int maxAttemps = 3;
		while (validationReturn == false && attemps <= maxAttemps) {
			System.out.print("\nUsuario: ");
			String user = scr.nextLine();
			System.out.print("Contrase�a: ");
			String pass = scr.nextLine();
			validationReturn = validation(user, pass, realUser, realPass); // Validamos los datos de registro ingresados
																			// por el usuario
			if (validationReturn == false && attemps < maxAttemps) {
				attemps++; // Aumentamos el contador de intentos para aceptar s�lo tres intentos err�neos
				System.out.println("\nUsuario o contrase�a incorrecto(s), reintente nuevamente:");
				System.out.println("Intento n�mero " + attemps);
			} else if (validationReturn == true) {
				System.out.println("\nIngreso exitoso");
			} else {
				attemps++;
			}
		}
		return attemps;
	}

	public static boolean validation(String user, String pass, String realUser, String realPass) {
		boolean validationReturn = false;
		if (user.compareTo(realUser) == 0 && pass.compareTo(realPass) == 0) // Validamos lo ingresado por el usuario con
																			// el valor real
			validationReturn = true;
		return validationReturn;
	}
}
