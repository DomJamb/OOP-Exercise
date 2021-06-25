package hr.fer.oop.swing;

import java.awt.*;
import javax.swing.*;

public class InputDataForm extends JPanel {
	
	JTextField txName = new JTextField();
	JCheckBox chVaccinated = new JCheckBox("vaccinated");
	JTextField txAddress = new JTextField();
	
	public InputDataForm() {
		setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
		setLayout(new GridLayout(3, 2, 5, 5));
		add(new JLabel("Name:", SwingConstants.RIGHT));
		add(txName);
		add(new JLabel());
		add(chVaccinated);
		add(new JLabel("Address:", SwingConstants.RIGHT));
		add(txAddress);
	}
}
