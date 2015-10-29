package dataAccess;

import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class DilemmaDAOMySQL implements DilemmaDAO {

	SimpleDateFormat ft;
	
	public DilemmaDAOMySQL() {
		ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public DilemmaDTO getDilemma(int dilemmaID) throws DALException {
		
		return null;
	}

	public void createDilemma(DilemmaDTO dilemma) throws DALException {
		Connector.doUpdate("INSERT INTO dilemma VALUES("+dilemma.getDilemmaID()+", "+dilemma.getUserID()
				+ ", '" + dilemma.getTitle() + "', '" + dilemma.getDescription() + "', '" 
				+ ft.format(dilemma.getDate()) + "');");
	}

}
