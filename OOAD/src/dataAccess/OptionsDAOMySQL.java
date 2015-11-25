package dataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class OptionsDAOMySQL implements OptionsDAO {

	@Override
	public void saveOptions(ArrayList<String> options, int dilemmaID) throws DALException {
		int id = 0;
		id = getNextOptionID();
		
		for (int i=0; i<options.size(); i++) {
			Connector.doUpdate("INSERT into options VALUES("+(id+i)+", "
					+dilemmaID+", '"+options.get(i)+"', "+0+")");
		}
	}
	
	@Override
	public int getNextOptionID() throws DALException {
		ResultSet rs = Connector.doQuery("SELECT max(optionID) from options;");
		try {
			if (!rs.first())
				return 1;
			return rs.getInt("max(optionID)")+1;
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

}
