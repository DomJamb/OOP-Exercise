package hr.fer.oop.vjezbelab;

public class swap {

	static void swapind(int[] arr) {
		
		int duljina = arr.length;
		int indeksi[] = new int[3];
		indeksi[0] = (int) (Math.random() * duljina);
		indeksi[1] = 0;
		indeksi[2] = 0;
		
		for (int i = 0; i < 2;) {
			if ((i == 0)  && ((indeksi[1] = (int) (Math.random() * duljina)) != indeksi[0])) {
				++i;
			}
			if ((i == 1) && ((indeksi[2] = (int) (Math.random() * duljina)) != indeksi[1]) && (indeksi[2] != indeksi[0])) {
				++i;
			}
		}
		
		int zamjena = 0;
		
		if (indeksi[1] < indeksi[0]) {
			zamjena = indeksi[1];
			indeksi[1] = indeksi[0];
			indeksi[0] = zamjena;
		}
		
		if (indeksi[2] < indeksi[1]) {
			zamjena = indeksi[2];
			indeksi[2] = indeksi[1];
			indeksi[1] = zamjena;
		}
		
		if (indeksi[1] < indeksi[0]) {
			zamjena = indeksi[1];
			indeksi[1] = indeksi[0];
			indeksi[0] = zamjena;
		}
			
		int pom = arr[indeksi[0]];
		
		arr[indeksi[0]] = arr[indeksi[1]];
		arr[indeksi[1]] = arr[indeksi[2]];
		arr[indeksi[2]] = pom;
		
	}

}
