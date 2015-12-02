package main;
import java.sql.SQLException;

import controller.ApplicationController;
import dataAccess.Connector;

public class Application {

	public static void main(String[] args) {
		
		/*
		try {
			new Connector();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		new ApplicationController().runApplication();
	}

}
