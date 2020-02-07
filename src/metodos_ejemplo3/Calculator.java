package metodos_ejemplo3;

public class Calculator {
	double num1, num2, sum = 0, rest = 0, mult = 0, div = 0;

	Calculator(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
		this.sum = sum(num1, num2);
		this.rest = rest(num1, num2);
		this.mult = mult(num1, num2);
		if (num2 != 0)
			this.div = div(num1, num2);
	}

	double sum(double num1, double num2) {
		sum = num1 + num2;
		return sum;
	}

	double rest(double num1, double num2) {
		rest = num1 - num2;
		return rest;
	}

	double mult(double num1, double num2) {
		mult = num1 * num2;
		return mult;
	}

	double div(double num1, double num2) {
		div = num1 / num2;
		return div;
	}

	void showOperation() {
		System.out.println("Suma: \t\t\t" + sum);
		System.out.println("Resta: \t\t\t" + rest);
		System.out.println("Multiplicación: \t" + mult);
		if (num2 != 0) {
			System.out.println("División: \t\t" + div);
		} else {
			System.out.println("División: \t\tMath.Error");
		}

	}
}
