package hr.fer.oop.trece;

public class Foodtype {
	
	private static int counter = 0;
	private String name;
	private int protein;
	private int carbs;
	private int fat;
	
	public Foodtype(String name, int protein, int carbs, int fat) {
		this.name = name;
		this.protein = protein;
		this.carbs = carbs;
		this.fat = fat;
		Foodtype.counter++;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getProtein() {
		return this.protein;
	}
	
	public int getCarbs() {
		return this.carbs;
	}
	
	public int getFat() {
		return this.fat;
	}
	
	@Override
	public String toString() {
		return String.format("%s: p - %d%%, c - %d%%, f - %d%%", name, protein, carbs, fat);
	}
	
	public static int getNumberOfCreatedInstances() {
		return counter;
	}
}
