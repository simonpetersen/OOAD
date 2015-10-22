package gui;

import java.awt.Dimension;

import javax.swing.JFrame;

public class GUI {
	
	JFrame window;
	
	public GUI() {
		window = new JFrame("DILEMMA");
	}

	public void openWindow() {
		window.setPreferredSize(new Dimension(400, 600));
		window.pack();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
	}
}
