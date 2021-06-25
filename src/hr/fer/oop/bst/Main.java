package hr.fer.oop.bst;

public class Main {

	public static void main(String[] args) {
		
		BST<String> bst = new BST<>();
		
		bst.add("Bic");

		bst.print();
		
		String[] polje = new String[] {"Glavac", "Vezm", "Jamb"};
		
		for (String p: polje) {
			bst.add(p);
		}
		
		bst.print();
		
		bst.add("Patrola");
		
		bst.print();
		
		bst.printInverted();
	}

}
