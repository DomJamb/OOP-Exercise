package hr.fer.oop.vjezbelab;

public class BrojSam {
	
	public static void main(String args) {
		System.out.println("U rijeci ima ovolko samoglasnika"+brojSamoglasnika(args));
	}
	
	public static int brojSamoglasnika(String str) {
		
		char[] polje = new char[str.length()];
		int brojac = 0;
		
		for (int i = 0; i < str.length(); i++) { 
            polje[i] = str.charAt(i); 
		}
		
		for (int i = 0; i < str.length(); ++i) {
			if (polje[i] == 'A' || polje[i] == 'E' || polje[i] == 'I' || polje[i] == 'O' || polje[i] == 'U' || polje[i] == 'a' || polje[i] == 'e' ||
					polje[i] == 'i' || polje[i] == 'o' || polje[i] == 'u') {
				brojac++;			
			}
		}
		return brojac;
	}
}
