package hr.fer.oop.prvedruge;

public class Pieu {

	public static void main(String[] args) {
		
		int pipet = (int) (Math.PI * 1e5);
		double suma = 0;
		int piprovj = 0;
		int i = 0;
		
		while (piprovj != pipet) {
			++i;
			suma += 1. / ((double) i * i);
			piprovj = (int) (1e5 * Math.sqrt(suma * 6));
		}
		
		System.out.printf("Pi nakon %d koraka je %.5f %n", i, Math.sqrt(suma * 6));

	}

}
