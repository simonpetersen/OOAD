package controller;
import gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
	
	GUI gui;
	DBController dbManager;
	
	public Controller() {
		gui = new GUI();
		dbManager = new DBController();
	}
	
	public void runApplication() {
		gui.openWindow();
		gui.setSaveButtonActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (gui.checkForMissingInput()) {
			//Dilemmaet skal gemmes i DB.
			gui.resetAllFields();
		}	
	}
	
}
