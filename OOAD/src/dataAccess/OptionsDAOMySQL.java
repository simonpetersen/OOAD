package dataAccess;

import java.util.ArrayList;

public class OptionsDAOMySQL implements OptionsDAO {

	@Override
	public void saveOptions(ArrayList<String> options, int dilemmaID) throws DALException {
		for (int i=0; i<options.size(); i++) {
			Connector.doUpdate("INSERT into options VALUES("+dilemmaID+", "+(i+1)+
					", "+options.get(i)+", "+0);
		}
	}

}
