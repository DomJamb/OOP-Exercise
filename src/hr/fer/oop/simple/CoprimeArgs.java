package hr.fer.oop.simple;
import hr.fer.oop.util.GCD;

public class CoprimeArgs {

	public static void main(String[] args) {
		
		int brojilo = args.length;
		int i = 0;
		int mjera;
		
		while (brojilo > 1) {
			mjera = GCD.main(args[i++], args[i]);
			i--;
			if (mjera == 1) {
				System.out.println("gcd("+Integer.parseInt(args[i++])+", "+Integer.parseInt(args[i++])+") = "+mjera+" coprime!");
			} else {
				System.out.println("gcd("+Integer.parseInt(args[i++])+", "+Integer.parseInt(args[i++])+") = "+mjera);
			}
			brojilo -= 2;
			
		}
	}

}
