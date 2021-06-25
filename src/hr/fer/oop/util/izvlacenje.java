package hr.fer.oop.util;

import java.util.Arrays;
import java.util.Random;

public class izvlacenje {

	public static int[] izvlacenjeM(int brojkugl, int brojizvlac) {
		
		boolean[] izvuceno = new boolean[brojkugl];
		int[] brojevi = new int[brojizvlac];
		
		for (int i = 0; i < brojizvlac;) {
			int broj = (int) (Math.random() * brojkugl);
			if (!izvuceno[broj]) {
				izvuceno[broj] = true;
				brojevi[i++] = broj + 1;
			}
		}
		
		Arrays.sort(brojevi);
		
		return brojevi;

	}
	
	public static int[] izvlacenjeR(int brojkugl, int brojizvlac) {
		
		boolean[] izvuceno = new boolean[brojkugl];
		int[] brojevi = new int[brojizvlac];
		
		Random rand = new Random();
		
		for (int i = 0; i < brojizvlac;) {
			int broj = rand.nextInt(brojkugl);
			if (!izvuceno[broj]) {
				izvuceno[broj] = true;
				brojevi[i++] = broj + 1;
			}
		}
		
		Arrays.sort(brojevi);
		
		return brojevi;

	}

}
