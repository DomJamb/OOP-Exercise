package hr.fer.oop.simple;

import java.util.Random;

public class CreateRandomNumbers {

	public static void main(String[] args) {
		
		if (args.length != 2) {
			System.out.println("Program requires lower and upper bound.");
			System.exit(0);
		}
		
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		
		if (n >= m) {
			System.out.println("Invalid bounds.");
			System.exit(0);
		}
		
		Random random = new Random();
		
		int prvipseudo = random.nextInt(m - n) + n;
		int drugipseudo;
		
		do {
			drugipseudo = random.nextInt(m - n) + n;
		} while (drugipseudo == prvipseudo);
		
		System.out.println("Two different random numbers in range ["+n+", "+m+"] are "+prvipseudo+" and "+drugipseudo);
	}

}
