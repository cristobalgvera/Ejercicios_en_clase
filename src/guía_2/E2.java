package guía_2;

import java.util.Random;

public class E2 {
	static Random rand = new Random();

	public static void main(String[] args) {
		int num, suma = 0, aux = 0;
		do {
			aux++;
			num = 1 + rand.nextInt(10);
			suma += num;
			System.out.println(aux + ": " + num);
		} while (aux < 15);
		System.out.println("\nSuma total: " + suma);
	}

}
