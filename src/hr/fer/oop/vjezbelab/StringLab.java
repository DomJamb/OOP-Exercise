package hr.fer.oop.vjezbelab;

public class StringLab {
	
	public static void main(String[] args) {
		
		System.out.println("Remixani nizovi su: "+stringFloss(args));
	}

	public static String stringFloss(String[] elements) {
		
		int n = elements.length;
		int brojac = 0;
		String niz = new String();
		
		for (int i = 0; i < n; ++i) {
			brojac += elements[i].length();
		}
				
		int j = 0;
		while (brojac > 0) {
			for (int i = 0; i < n; ++i) {
				if (j < elements[i].length()) {
					niz += elements[i].charAt(j);
					brojac--;
				}		
			}
			j++;
		}
		return niz;
		
	}
}
