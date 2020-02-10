package superClass_ejemplo;

public class Acuático extends Animal {
	private int fins;

	Acuático() {
		super();
		this.fins = -1;
	}

	Acuático(String name, double weight, int years, int zone, int sex, int fins) {
		super(name, weight, years, zone, sex);
		this.fins = -1;
	}
	
	public String toString() {
		String animalDetail = getName() + "\t\t" + getWeight() + "\t\t\t" + getYears() + "\t\t\t" + getZone()
				+ "\t\t\t" + getSex() + "\t\t\t" + getFins();
		return animalDetail;
	}
	
	public static String nombreAnimal() {
		int aux = (int) (Math.random() * 5 + 1);
		String name = null;
		switch (aux) {
		case 1:
			name = "Ballena	";
			break;
		case 2:
			name = "Tiburón	";
			break;
		case 3:
			name = "Calamar	";
			break;
		case 4:
			name = "Orca	";
			break;
		case 5:
			name = "Erizo	";
			break;
		}
		return name;
	}

	public int getFins() {
		return fins;
	}

	public void setFins(int fins) {
		this.fins = fins;
	}

}
