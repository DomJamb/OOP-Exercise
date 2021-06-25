package hr.fer.oop.minmax;
import java.util.Arrays;
import java.util.Scanner;

public class Minmax {

	public static void main(String[] args) {
		
		int n; //velicina polja
		String kljuc; // switch izmedu trazenja min ili max
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Upisite Min ako zelite trazenje minimuma\nodnosno Max ako zelite trazenje maksimuma.");
		kljuc = scanner.nextLine();
			
		do {
			System.out.println("Upisite velicinu polja:");
			n = scanner.nextInt();
		} while(n <= 0);
		
		
		int[] polje = new int[n];
		
		System.out.println("Upisite clanove polja:");
		for (int i = 0; i < n; i++) {
			polje[i] = scanner.nextInt();
		}
		
		Arrays.sort(polje);
		
		if (kljuc.equalsIgnoreCase("Min")) {
			System.out.println("Najmanji element u polju je "+polje[0]+".");
		} else if (kljuc.equalsIgnoreCase("Max")) {
			System.out.println("Najveci element u polju je "+polje[polje.length - 1]+".");
		}
		
		scanner.close();
	} 

}