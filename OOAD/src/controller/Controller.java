package controller;
import gui.GUI;

public class Controller {
	
	GUI gui;
	
	public Controller() {
		gui = new GUI();
	}
	
	public void runApplication() {
		gui.openWindow();
	}
}
