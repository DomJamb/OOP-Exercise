package hr.fer.oop.prvedruge;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Rijeci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		String recenica;
		String[] rijeci;
		ArrayList<String> niz = new ArrayList<String>();
		
		while (true) {
			recenica = sc.nextLine();
			if (recenica.equalsIgnoreCase("quit") == true) {
				break;
			} else {
				recenica = recenica.trim();
				if (recenica.isEmpty() == false) {
					rijeci = recenica.split(" ");
					niz.add(rijeci[rand.nextInt(rijeci.length)]);
				}
			}
		}
		for (String x: niz) {
			System.out.print(x.toUpperCase()+" ");
		}
		sc.close();
	}

}
