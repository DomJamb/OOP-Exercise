package hr.fer.oop.vjezbelab;

public class Provjera {
	
	public static void main(String[] args) {
		
		System.out.println("Da vidimo "+common_digit(Integer.parseInt(args[0]),Integer.parseInt(args[1])));
		
	}
	
	static boolean common_digit(int twoDigitNum1, int twoDigitNum2) {
		
		twoDigitNum1 = Math.abs(twoDigitNum1);
		twoDigitNum2 = Math.abs(twoDigitNum2);
		
		int prva = twoDigitNum1 / 10; 
	    int druga = twoDigitNum1 % 10;
	    int treca = twoDigitNum2 / 10;
	    int cet = twoDigitNum2 % 10;
		
		int test = 0;
		
		if (prva == druga || prva == treca || prva == cet || druga == treca || druga == cet || treca == cet) {
			test = 1;
		}
		
		if (twoDigitNum1 < 10 || twoDigitNum1 > 99 || twoDigitNum2 < 10 || twoDigitNum2 > 99 || test == 0) {
			return false;
		} else {
			return true;
		}
	}
}
