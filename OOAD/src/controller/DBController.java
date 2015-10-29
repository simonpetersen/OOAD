package controller;

import dataAccess.DilemmaDAOMySQL;
import dataAccess.UserDAOMySQL;

public class DBController {

	DilemmaDAOMySQL dilemmaDB;
	UserDAOMySQL userDB;
	
	public DBController() {
		dilemmaDB = new DilemmaDAOMySQL();
		userDB = new UserDAOMySQL();
	}
}
