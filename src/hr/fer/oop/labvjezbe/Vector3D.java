package hr.fer.oop.labvjezbe;

public class Vector3D extends Triple<Number>{

	public Vector3D(Number first, Number second, Number third) {
		super(first, second, third);
	}
	
	public static double dotProduct(Vector3D first, Vector3D second) {
		return multiply(first.getElement(1), second.getElement(1)) + multiply(first.getElement(2), second.getElement(2)) + multiply(first.getElement(3), second.getElement(3));
	}
	
	private static double multiply(Number number1, Number number2) {
		
	        double x = number1.doubleValue();
	        double y = number2.doubleValue();

	        return x * y;
	}
}
