package guía_4_E5;

public class Employees {
	private String name, lastName;
	private int age, salary;
	private boolean bonus = false;

	public String toString() {
		System.out.print(name + "\t" + lastName + "\t" + age + "\t" + salary + "\t");
		if (bonus == true)
			System.out.print("(BONUS)");
		System.out.println();
		return null;
	}

	Employees() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean setBonus(int age) {
		if (age > 40)
			bonus = true;
		return bonus;
	}
}
