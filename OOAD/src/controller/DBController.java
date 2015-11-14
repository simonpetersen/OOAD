package controller;

import java.util.ArrayList;

import dataAccess.DALException;
import dataAccess.DilemmaDAOMySQL;
import dataAccess.DilemmaDTO;
import dataAccess.OptionsDAOMySQL;
import dataAccess.UserDAOMySQL;

public class DBController {

	DilemmaDAOMySQL dilemmaDB;
	OptionsDAOMySQL optionsDB;
	UserDAOMySQL userDB;
	
	public DBController() {
		dilemmaDB = new DilemmaDAOMySQL();
		userDB = new UserDAOMySQL();
	}
	
	public void saveDilemma(DilemmaDTO dilemma, ArrayList<String> options) {
		int ID=0;
		try {
			ID = dilemmaDB.getNextDilemmaID();
		} catch (DALException e1) {
			e1.printStackTrace();
		}
		
		dilemma.setDilemmaID(ID);
		try {
			dilemmaDB.createDilemma(dilemma);
		} catch (DALException e) {
			e.printStackTrace();
		}
		
		try {
			optionsDB.saveOptions(options, ID);
		} catch (DALException e) {
			
		}
	}
	
}