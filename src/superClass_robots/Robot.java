package superClass_robots;

import java.util.ArrayList;
import java.util.Collections;

public class Robot implements Comparable<Robot> {
	protected int id;
	protected double life;
	static protected ArrayList<Robot> robot = new ArrayList<Robot>();
	
	public static void main(String[] args) {
		Robot.llenarArray();
		System.out.println(Robot.imprimirTodos()+"\n");
		System.out.println(Robot.imprimir50()+"\n");
		System.out.println(Robot.imprimirTresMayores());
	}

	public Robot() {
	}

	public Robot(int id, double life) {
		this.id = id;
		this.life = life;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLife() {
		return life;
	}

	public void setLife(double life) {
		this.life = life;
	}

	static String imprimirTodos() {
		StringBuilder sb = new StringBuilder();
		sb.append("*************************\nLISTA ORDENADA DE ROBOTS\n");
		sb.append("TOTAL DE ROBOTS: " + robot.size() + "\n*************************\n");
		sb.append("ID\t\tVIDA (%)\n*************************\n\n");
		for (int i = 0; i < robot.size(); i++) {
			sb.append(robot.get(i).getId() + "\t\t" + robot.get(i).getLife() + "\n");
		}
		sb.append("\n*************************");
		return sb.toString();
	}

	static String imprimir50() {
		StringBuilder sb = new StringBuilder();
		sb.append("*************************\nROBOTS CON MÁS DEL 50% DE VIDA");
		int lenght = sb.length();
		sb.append("ID\t\tVIDA (%)\n*************************\n\n");
		int aux = 0;
		for (int i = 0; i < robot.size(); i++) {
			if (robot.get(i).getLife() > 50) {
				sb.append(robot.get(i).getId() + "\t\t" + robot.get(i).getLife() + "\n");
				aux++;
			}
		}
		sb.insert(lenght, "\nTOTAL DE ROBOTS: " + aux + "\n*************************\n");
		sb.append("\n*************************");
		return sb.toString();
	}

	static String imprimirTresMayores() {
		StringBuilder sb = new StringBuilder();
		sb.append("*************************\nTOP 3 ROBOTS CON MAYOR VIDA\n*************************\n");
		sb.append("ID\t\tVIDA (%)\n*************************\n\n");
		for (int i = robot.size() - 1; i > robot.size() - 4; i--) {
			sb.append(robot.get(i).getId() + "\t\t" + robot.get(i).getLife() + "\n");
		}
		sb.append("\n*************************");
		return sb.toString();
	}

	static void llenarArray() {
		for (int i = 0; i < (int) (Math.random() * 5 + 5); i++) {
			robot.add(new Robot((i + 1), Math.round((Math.random() * 99 + 1) * 100d) / 100d));
		}
		Collections.sort(robot);
	}

	public int compareTo(Robot another) {
		if (this.getLife() < another.getLife()) {
			return -1;
		} else {
			return 1;
		}
	}

}
