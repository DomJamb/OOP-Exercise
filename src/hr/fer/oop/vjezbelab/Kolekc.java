package hr.fer.oop.vjezbelab;

import java.util.*;

public class Kolekc {
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>(10);
		lista.add("okej");
		lista.add("test");
		lista.add("sigh");
		
		Iterator<String> it = lista.iterator();
		System.out.println(it.next());
		it.remove();
		System.out.println(lista.size());
		System.out.println(lista);
	}
}
