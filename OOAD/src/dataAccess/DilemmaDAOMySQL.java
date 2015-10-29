package dataAccess;

import java.sql.ResultSet;

public class DilemmaDAOMySQL implements DilemmaDAO {

	public DilemmaDTO getDilemma(int dilemmaID) throws DALException {
		
		return null;
	}

	public void createDilemma(DilemmaDTO dilemma) throws DALException {
		ResultSet rs = Connector.doQuery("INSERT INTO dilemma VALUES(");
	}

}
