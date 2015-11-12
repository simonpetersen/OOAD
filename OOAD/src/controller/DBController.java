package controller;

import dataAccess.DALException;
import dataAccess.DilemmaDAOMySQL;
import dataAccess.DilemmaDTO;
import dataAccess.UserDAOMySQL;

public class DBController {

	DilemmaDAOMySQL dilemmaDB;
	UserDAOMySQL userDB;
	
	public DBController() {
		dilemmaDB = new DilemmaDAOMySQL();
		userDB = new UserDAOMySQL();
	}
	
	public void saveDilemma(DilemmaDTO dilemma) {
		try {
			dilemmaDB.createDilemma(dilemma);
		} catch (DALException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}