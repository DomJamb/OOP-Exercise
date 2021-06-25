package hr.fer.oop.cetvrt;

public class Main {

	public static void main(String[] args) {
		
		Van van1 = new Van("69", "pezo", 2002, 100., 2., (short) 5);
		CargoVan cargo1 = new CargoVan("69", "pezo", 2002, 100., 2., (short) 5, 2000.);
		
		System.out.println(van1 instanceof Van);
		System.out.println(cargo1 instanceof CargoVan);
		System.out.println(van1 instanceof CargoVan);
		System.out.println(cargo1 instanceof Van);
		
		Van van2 = new CargoVan("69", "pezo", 2002, 100., 2., (short) 5, 2000.);
		
		System.out.println(van2 instanceof CargoVan);
		
		System.out.println(((CargoVan) van2).getMaxLoad());
	}

}
