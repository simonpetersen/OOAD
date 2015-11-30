package test;

import static org.junit.Assert.fail;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dataAccess.Connector;
import dataAccess.DALException;
import dataAccess.OptionsDAOMySQL;


public class testOption {
	
	private ArrayList<String> arrayList1;
	private int dilemmaID1;
	private OptionsDAOMySQL optionsDAO;
	
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
		
		
		optionsDAO.saveOptions(arrayList1, dilemmaID1);
	}
	
	@After
	public void tearDown() throws Exception {
		this.arrayList1 = new ArrayList<String>();
		this.dilemmaID1 = 1;

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	@Test	
	public void testSave() throws DALException{
			
		optionsDAO.saveOptions(arrayList1, dilemmaID1);
		 ArrayList<String> expected = arrayList1;
		 ArrayList<String> actual;
		
			
		actual = optionsDAO.getOptions(dilemmaID1);
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void getOption() throws DALException {
		
	}
	
}

// Gemmer og henter de samme options.

