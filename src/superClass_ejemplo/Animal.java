package superClass_ejemplo;

public class Animal {
	private String name;
	private double weight;
	private int years, sex, zone;

	Animal() {
		this.name = "";
		this.weight = -1;
		this.years = -1;
		this.zone = -1;
		this.sex = -1;
	}

	Animal(String name, double weight, int years, int zone, int sex) {
		this.name = name;
		this.weight = weight;
		this.years = years;
		this.zone = zone;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

}
