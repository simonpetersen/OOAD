package dataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Dilemma;

public class OptionsDAOMySQL implements OptionsDAO {

	@Override
	public void saveOptions(ArrayList<String> options, int dilemmaID) throws DALException {
		int id = 0;
		id = getNextOptionID();
		
		for (int i=0; i<options.size(); i++) {
			Connector.doUpdate("INSERT into answerOptions VALUES("+(id+i)+", "
					+dilemmaID+", '"+options.get(i)+"', "+0+")");
		}
	}
	
	@Override
	public int getNextOptionID() throws DALException {
		ResultSet rs = Connector.doQuery("SELECT max(optionID) from answerOptions;");
		try {
			if (!rs.first())
				return 1;
			return rs.getInt("max(optionID)")+1;
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}
	
	public ArrayList<String> getOptions(int dilemmaID) throws DALException{
		ResultSet rss = Connector.doQuery("SELECT answerOption from answerOptions WHERE dilemmaID = " + dilemmaID);
		ArrayList<String> al1 = new ArrayList<String>();
		try {
			while (rss.next()){
				al1.add(rss.getString("answerOption"));
			}			
			return al1;
		}
			catch (SQLException e) {
				throw new DALException(e);
			}
		}
		
	}



