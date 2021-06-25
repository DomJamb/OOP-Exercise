package hr.fer.oop.swing;

import javax.swing.SwingUtilities;

public class EmailMain {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(()-> new EmailClient());
	}
}

