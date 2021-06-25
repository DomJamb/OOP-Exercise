package hr.fer.oop.prosjek;
import java.util.Scanner;

public class Prosjek {

	public static void main(String[] args) {
		
		int n; //duljina polja
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Unesite zeljenu velicinu polja");
		n = scanner.nextInt();
		
		int[] polje = new int[n];
		
		int suma = 0;
		
		System.out.println("Unesite "+n+" brojeva");
		
		for (int i = 0; i < n; i++) {
			polje[i] = scanner.nextInt();
			suma += polje[i];
		}

		scanner.close();
		
		double prosjek = (double) suma / n;
		
		System.out.println("Prosjek zadanih brojeva je "+prosjek);
	}

}
