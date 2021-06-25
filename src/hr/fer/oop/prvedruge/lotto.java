package hr.fer.oop.prvedruge;

public class lotto {
	
	public static void main(String[] args) {
		
		boolean[] brojevi = new boolean[39];
		
		for (int i = 0; i < 7;) {
			int broj = (int) (Math.random() * 39);
			if (!brojevi[broj]) {
				brojevi[broj] = true;
				++i;
			}
		}
		
		for (int i = 0; i < 39; ++i) {
			if (brojevi[i]) {
				System.out.println(""+(i + 1));
			}
		}
		
	}
}
