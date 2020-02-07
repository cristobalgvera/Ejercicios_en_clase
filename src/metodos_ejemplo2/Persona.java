package metodos_ejemplo2;

public class Persona {

	String name;
	int age;
	boolean overAge;

	Persona(String name, int age) {
		this.name = name;
		this.age = age;
		this.overAge = overAge(age);
	}

	boolean overAge(int age) {
		if (age > 17) {
			return true;
		} else {
			return false;
		}
	}

	void Advertising() {
		String MAYOR = "mayor de edad", MENOR = "menor de edad";
		System.out.print(name + " es ");
		if (overAge == true) {
			System.out.println(MAYOR + " (" + age + ")");
		} else {
			System.out.println(MENOR + " (" + age + ")");
		}
	}
}
