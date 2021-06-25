package hr.fer.oop.prvedruge;

public class Pileib {

	public static void main(String[] args) {
		
		double sum = 0;
		int nextpow = 10;
		
		for (int i = 0; i <= 1000000; ++i) {
			if (i % 2 == 0) {
				sum += 1. / (2 * i + 1);
			} else {
				sum -= 1. / (2 * i + 1);
			}
			
			if (i == nextpow) {
				System.out.printf("i = %d, pi = %.10f %n", i, sum * 4);
				nextpow *= 10;
		}

		}

	}

}
