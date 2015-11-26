package dataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import model.Dilemma;

public class DilemmaDAOMySQL implements DilemmaDAO {

	SimpleDateFormat ft;
	
	public DilemmaDAOMySQL() {
		ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	}
	
	public Dilemma getDilemma(int dilemmaID) throws DALException {
		
		return null;
	}

	public void createDilemma(Dilemma dilemma) throws DALException {
		Connector.doUpdate("INSERT INTO dilemma VALUES("+dilemma.getDilemmaID()+", "+dilemma.getUserID()
				+ ", '" + dilemma.getTitle() + "', '" + dilemma.getDescription() + "', " 
				+dilemma.getSeriousness()+", '"+ft.format(dilemma.getDate()) +"', '"+dilemma.getCategory()+"')");
	}
	
	public int getNextDilemmaID() throws DALException {
		ResultSet rs = Connector.doQuery("SELECT max(dilemmaID) from dilemma;");
		try {
			if (!rs.first())
				return 1;
			return rs.getInt("max(dilemmaID)")+1;
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

}
