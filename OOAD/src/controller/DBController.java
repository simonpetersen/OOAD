package controller;

import java.util.ArrayList;

import model.Dilemma;
import dataAccess.DALException;
import dataAccess.DBInitialiser;
import dataAccess.DilemmaDAOMySQL;
import dataAccess.OptionsDAOMySQL;

public class DBController {

	DilemmaDAOMySQL dilemmaDB;
	OptionsDAOMySQL optionsDB;
	DBInitialiser dbCreator;
	
	public DBController() {
		dbCreator = new DBInitialiser();
		dilemmaDB = new DilemmaDAOMySQL();
		optionsDB = new OptionsDAOMySQL();
	}
	
	public void createDilemma() {
		try{
			dbCreator.createDB();
		} catch (DALException e) {
			System.out.println(e.getStackTrace());
		}
	}
	
	public void saveDilemma(Dilemma dilemma, ArrayList<String> options) {
		int ID=0;
		try {
			ID = dilemmaDB.getNextDilemmaID();
		} catch (DALException e1) {
			e1.printStackTrace();
		}
		
		dilemma.setDilemmaID(ID);
		try {
			dilemmaDB.saveDilemma(dilemma);
		} catch (DALException e) {
			e.printStackTrace();
		}
		
		try {
			optionsDB.saveOptions(options, ID);
		} catch (DALException e) {
			e.printStackTrace();
		}
	}
	
}