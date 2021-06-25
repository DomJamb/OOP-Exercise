package hr.fer.oop.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Scoreboard extends JFrame {

	JButton btRed = new JButton("New point for red ");
	JButton btBlue = new JButton("New point for blue");
	JButton btReset = new JButton("Reset");
	JLabel lbRed = new JLabel("0", SwingConstants.CENTER);
	JLabel lbBlue = new JLabel("0", SwingConstants.CENTER);
	
	public Scoreboard() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 200); 
		setTitle("Scoreboard");
		lbBlue.setBackground(Color.BLUE);
		lbBlue.setFont(new Font("Verdana", Font.BOLD, 18));
		lbBlue.setOpaque(true);
		lbRed.setBackground(Color.RED);
		lbRed.setFont(new Font("Verdana", Font.BOLD, 18));
		lbRed.setOpaque(true);
		
		JPanel northPanel = new JPanel();
		northPanel.add(btReset);
		add(northPanel, BorderLayout.NORTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(1, 0, 5, 5));
		centerPanel.add(lbRed);
		centerPanel.add(lbBlue);
		add(centerPanel, BorderLayout.CENTER);
	  	
	  	JPanel southPanel = new JPanel();
	  	add(southPanel, BorderLayout.SOUTH);
	  	southPanel.add(btRed);
	  	southPanel.add(btBlue);
	  	
	  	btReset.addActionListener((e)-> { 
	  										lbRed.setText("0");
	  										lbBlue.setText("0");
	  									});
	  	MultiListener listener = new MultiListener();
	  	btRed.addActionListener((ActionListener) listener);
	  	btBlue.addActionListener(listener);
	  	pack(); 
	}
	
	class MultiListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int value;
			if(e.getSource() == btRed) {
				value = Integer.valueOf(lbRed.getText()) + 1;
				lbRed.setText(String.valueOf(value));
			}	
			if(e.getSource() == btBlue) {
				value = Integer.valueOf(lbBlue.getText()) + 1;
				lbBlue.setText(String.valueOf(value));
			}
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			Scoreboard frame = new Scoreboard();	
	     	frame.setVisible(true);
	    });
	}

}
