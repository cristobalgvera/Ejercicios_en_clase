package guía_3;

import java.util.Scanner;

public class E1 {
	static Scanner scr = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("CALCULADORA SIMPLE\nLogin");
		int attemps = login(); // Obtenemos el número de intentos realizados para cerrar el programa en caso de
								// ser necesario
		if (attemps > 3) {
			System.out.println("\nNúmero de intentos máximo superado, su sesión ha sido bloqueada");
			System.exit(attemps);
		}
		calculator(); // Todas las funciones que opera la calculadora dentro de la clase
		System.out.print("\nGracias por tu participación");
	}

	public static boolean calculator() {
		boolean calculatorClose = true; // Regula el cierre del programa solicitado por el usuario
		boolean numericIntBoolean = false; // Regula el ingreso de variables enteras para el menú de opciones
		int attemps = 0; // Ayuda visual para el usuario y su cantidad de operaciones realizadas
		double firstNumber = 0, secondNumber = 0, operation = 1; // Variables ingresadas por el usuario
		while (calculatorClose == true) { // While dependiente de la respuesta del usuario para un nuevo uso
			attemps++;
			System.out.println("\nNúmero de operación: " + attemps);
			System.out.println("Ingrese los números a operar:\n");
			System.out.print("1: ");
			firstNumber = scr.nextDouble();
			System.out.print("2: ");
			secondNumber = scr.nextDouble();
			while (numericIntBoolean == false) {
				System.out.println("\n(1) Suma\n(2) Resta\n(3) Multiplicación\n(4) División");
				System.out.print("\nSeleccione el tipo de operación: ");
				operation = scr.nextDouble();
				numericIntBoolean = numericIntValidation(operation, 1, 4); // Validamos que el número ingresado es
																			// correcto de acuerdo al menú de opciones
				if (numericIntBoolean == false)
					System.out.println("Opción ingresada no es válida, reintente:");
			}
			double result = 0; // Resultado de la operación solicitada por el usuario
			switch ((int) operation) { // Realizamos la operación que solicita el usuario
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
				if (secondNumber != 0) { // Validamos que la división por cero
					result = division(firstNumber, secondNumber);
					System.out.println("\n" + firstNumber + " / " + secondNumber + " = " + result);
				} else {
					System.out.println("\nMathError - No puedes dividir por cero");
				}
				break;
			}
			numericIntBoolean = false; // Reiniciamos el ingreso de variables enteras
			scr.nextLine(); // Quitamos posibles líneas innecesarias
			calculatorClose = close(); // Preguntamos por el cierre del programa al usuario
		}
		return calculatorClose;
	}

	public static boolean close() {
		System.out.println("\n¿Desea realizar otra operación? (S/N)");
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
		if (number >= minNumber && number <= maxNumber && number % 1 == 0) // Validación para saber que el número comple
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
			System.out.print("Contraseña: ");
			String pass = scr.nextLine();
			validationReturn = validation(user, pass, realUser, realPass); // Validamos los datos de registro ingresados
																			// por el usuario
			if (validationReturn == false && attemps < maxAttemps) {
				attemps++; // Aumentamos el contador de intentos para aceptar sólo tres intentos erróneos
				System.out.println("\nUsuario o contraseña incorrecto(s), reintente nuevamente:");
				System.out.println("Intento número " + attemps);
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
