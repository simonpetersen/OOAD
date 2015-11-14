package controller;
import gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	
	GUI gui;
	
	public Controller() {
		gui = new GUI();
	}
	
	public void runApplication() {
		gui.openWindow();
		gui.setSaveButtonActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (gui.checkForMissingInput())
			System.out.println(gui.checkForMissingInput());
		else 
			gui.resetAllFields();
	}
	
}
