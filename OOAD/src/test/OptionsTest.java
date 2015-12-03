package test;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dataAccess.Connector;
import dataAccess.DALException;
import dataAccess.DBInitialiser;
import dataAccess.OptionsDAOMySQL;


public class OptionsTest {
	
	private ArrayList<String> arrayList1;
	private int dilemmaID1;
	private OptionsDAOMySQL optionsDAO;
	private DBInitialiser dbCreator;
	
	@Before
	public void setUp() throws Exception {
		try {
			new Connector();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		optionsDAO = new OptionsDAOMySQL();
		this.arrayList1 = new ArrayList<String>();
		this.dilemmaID1 = 1;
		arrayList1.add("S");
		arrayList1.add("T");
		arrayList1.add("D");
		
		dbCreator = new DBInitialiser();
		dbCreator.createDB();
		dbCreator.addDilemma(); //Der tilføjes et dilemma, så der er et dilemmaID i DB:
	}
	
	@After
	public void tearDown() throws Exception {
		this.arrayList1 = new ArrayList<String>();
		this.dilemmaID1 = 1;

	}

	@Test	
	public void testSave() throws DALException{
			
		optionsDAO.saveOptions(arrayList1, dilemmaID1);
		 ArrayList<String> expected = arrayList1;
		 ArrayList<String> actual;
		
			
		actual = optionsDAO.getOptions(dilemmaID1);
		
		Assert.assertEquals(expected, actual);
		
	}
	
}

// Gemmer og henter de samme options.

