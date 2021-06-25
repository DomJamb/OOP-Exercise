package hr.fer.oop.swing;

import javax.swing.*;

public class LayoutDemo extends JFrame {
	
	public LayoutDemo() {
		
		this.setTitle("Layout demo");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JTabbedPane tp = new JTabbedPane();
		tp.addTab("Layout 1", new PanelWithLayout1());
		tp.addTab("Layout 2", new PanelWithLayout2());
		tp.addTab("Layout 3", new PanelWithLayout3());
		tp.addTab("Input Data Form", new InputDataForm()); 
		
		this.add(tp);
		this.pack();
		this.setLocation(700, 400);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LayoutDemo();
                System.out.println(Thread.currentThread());
            }
        });
	}
}
