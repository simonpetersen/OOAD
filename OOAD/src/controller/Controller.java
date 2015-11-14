package controller;
import gui.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dataAccess.DilemmaDTO;

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
			DilemmaDTO dilemma = new DilemmaDTO(gui.getTitleFieldText(), gui.getDescription(), gui.getTime());
			dbManager.saveDilemma(dilemma);
			gui.resetAllFields();
		}	
	}
	
}
