package guía_4_E5;

import java.util.*;

public class Principal {
	static List<Employees> employees = new ArrayList<Employees>();

	public static void main(String[] args) {
		int size = (int) (Math.random() * 25) + 1;
		for (int i = 0; i < size; i++) {
			employees.add(new Employees());
			employees.get(i).setAge((int) (Math.random() * 47) + 18);
			employees.get(i).setSalary((int) (Math.random() * 700000) + 301000);
			employees.get(i).setName((i + 1) + "");
			employees.get(i).setLastName((size - i) + "");
			employees.get(i).setBonus(employees.get(i).getAge());
		}
		for (int i = 0; i < size; i++) {
			employees.get(i).toString();
		}
	}

}
