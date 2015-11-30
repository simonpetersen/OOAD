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
		ResultSet rs = Connector.doQuery("SELECT * FROM dilemma WHERE dilemmaID = "+dilemmaID);
		try {
			if (!rs.first())
				throw new DALException("Der eksisterer intet dilemma med ID: "
						+ dilemmaID);
			return new Dilemma(rs.getString("title"), rs.getString("description"), rs.getString("category"), rs.getInt("seriousness"));
		} catch (SQLException e) {
			throw new DALException(e);
		}
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
