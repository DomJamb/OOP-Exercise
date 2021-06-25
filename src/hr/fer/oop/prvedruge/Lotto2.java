package hr.fer.oop.prvedruge;

import hr.fer.oop.util.izvlacenje;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Upisite broj kugli i broj izvlacenja");
		
		int brojkugl = sc.nextInt();
		int brojizvlac = sc.nextInt();
		
		while (brojkugl > 1 && brojizvlac < brojkugl && brojizvlac > 0) {
			int[] brojevi = izvlacenje.izvlacenjeM(brojkugl, brojizvlac);
			for (int i = 0; i < brojevi.length; ++i) {
				System.out.println(""+brojevi[i]);
			}
			System.out.println("Upisite broj kugli i broj izvlacenja");
			brojkugl = sc.nextInt();
			brojizvlac = sc.nextInt();
		}
		
		sc.close();
	}

}
