package hr.fer.oop.labvjezbe;

public class Utils {
	
	public static int checkPassword(String pass) {
		
		int secure = 0;
		int numbers = 0;
		int caps = 0;
		
		if (pass.length() < 6) {
			throw new IllegalArgumentException();
		}
		
		for (int i = 0; i < pass.length(); ++i) {
			if (Character.isDigit(pass.charAt(i))) {
				numbers++;
			}
			if (Character.isUpperCase(pass.charAt(i))) {
				caps++;
			}
		}
		
		secure = pass.length() + caps * 2 + numbers * 3;
		
		if (secure < 10) {
			throw new SecurityException();
		}
		
		return secure;
	}
}
