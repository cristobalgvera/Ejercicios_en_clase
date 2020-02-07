package guía_3;

public class E5 {
	static String[][] employees = new String[20][2];

	public static void main(String[] args) {
//		System.out.println(" ----------------------------------------------- \n");
		System.out.println(" _______________________________________________ \n");
		System.out.println("|\tEMPLEADO\t|\t SUELDO\t\t|");
		System.out.println(" _______________________________________________ \n");
//		System.out.println("\n ----------------------------------------------- ");
//		System.out.println(" ----------------------------------------------- \n");
		for (int i = 0; i < employees.length; i++) {
			employees[i][0] = (i + 1) + "";
			employees[i][1] = (int) ((Math.random() * 400000) + 301000) + "";
			System.out.println("|\t   " + (i + 1) + "\t\t|\t $" + employees[i][1] + "\t|");
			System.out.println(" ----------------------------------------------- ");
		}
		int higherPay = 0;
		for (int i = 0; i < employees.length; i++) {
			if (employees[i][1].compareTo(employees[higherPay][1]) > 0)
				higherPay = i;
		}
		System.out.println(
				"\nEl empleado " + employees[higherPay][0] + " tiene el mayor sueldo con $" + employees[higherPay][1]);
	}
}
