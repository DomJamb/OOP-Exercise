package hr.fer.oop.util;

public class GCD {

	public static int main(String arg1, String arg2) {
		
		int n = Integer.parseInt(arg1);
		int m = Integer.parseInt(arg2); //argumenti
		
		int manji;
		
		if (n >= m) {
			manji = m;
		} else {
			manji = n;
		}
		
		int djel = manji;
		boolean provjera = false;
		
		do {
			if ((n % djel == 0) && (m % djel == 0)) {
				provjera = true;
			} else {
				djel--;
			}
		    
		} while ((provjera == false) && (djel > 1));

		return djel;
	}

}
