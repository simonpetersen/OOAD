package test;

import java.sql.SQLException;

import model.Dilemma;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import dataAccess.Connector;
import dataAccess.DALException;
import dataAccess.DBInitialiser;
import dataAccess.DilemmaDAOMySQL;

public class DilemmaTest {
	
	private DilemmaDAOMySQL dilemmaMySQL;

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
		
		dilemmaMySQL = new DilemmaDAOMySQL();
		new DBInitialiser().createDB(); 
	}
	
	@After
	public void tearDown() throws Exception {
		
	}
	
	@Test
	public void testEntities() {
		Assert.assertNotNull(dilemmaMySQL);
	}
	
	@Test
	public void testSaveDilemma() {
		Dilemma expected = new Dilemma("Titel", "Beskrivelse", "Hobby", 60, 2);
		Dilemma actual = new Dilemma();
		try {
			dilemmaMySQL.createDilemma(expected);
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			actual = dilemmaMySQL.getDilemma(0);
		} catch (DALException e) {
			e.printStackTrace();
		}
		Assert.assertEquals(expected.getTitle(), actual.getTitle());
		Assert.assertEquals(expected.getDescription(), actual.getDescription());
		Assert.assertEquals(expected.getCategory(), actual.getCategory());
		Assert.assertEquals(expected.getSeriousness(), actual.getSeriousness());
	}

}
