package hr.fer.oop.simple;

import java.util.Arrays;

public class Findmin {

	public static void main(String[] args) {
		

		if (args.length == 0) {
			System.out.println("No arguments recieved");
		} else {
			int[] polje = new int[args.length];
			for (int i = 0; i < args.length; i++) {
				polje[i] = Integer.parseInt(args[i]);
			}			
			Arrays.sort(polje);
			System.out.println("Najmanji clan je "+polje[0]);
		}

	}

}
