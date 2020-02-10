package superClass_ejemplo;

public class Terrestre extends Animal {
	private int legs;

	Terrestre() {
		super();
		this.legs = -1;
	}

	Terrestre(String name, double weight, int years, int zone, int sex, int legs) {
		super(name, weight, years, zone, sex);
		this.legs = legs;
	}

	public String toString() {
		String animalDetail = getName() + "\t\t\t" + getWeight() + "\t" + getYears() + "\t\t\t" + getZone()
				+ "\t\t\t" + getSex() + "\t\t\t" + getLegs();
		return animalDetail;
	}

	public static String nombreAnimal() {
		int aux = (int) (Math.random() * 5 + 1);
		String name = null;
		switch (aux) {
		case 1:
			name = "León	";
			break;
		case 2:
			name = "Perro	";
			break;
		case 3:
			name = "Gato	";
			break;
		case 4:
			name = "Tigre	";
			break;
		case 5:
			name = "Caballo	";
			break;
		}
		return name;
	}

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
}
