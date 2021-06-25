package hr.fer.oop.trece;

public class Food {
	
	private Foodtype type;
	private int weight;
	
	public Food(Foodtype type, int weight) {
		this.type = type;
		this.weight = weight;
	}
	
	public Foodtype getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return String.format("%s, w - %dg", type.toString(), weight);
	}
	
	public double getProtein() {
		return type.getProtein() * weight / 100.0;
	}
	
	public double getCarbs() {
		return type.getCarbs() * weight / 100.0;
	}
	
	public double getFat() {
		return type.getFat() * weight / 100.0;
	}
	
	public String toStringInGrams() {
		return String.format("%s: p - %.1fg, c - %.1fg, f - %.1fg, w - %dg", type.getName(), getProtein(), getCarbs(), getFat(), weight);
	}
}
