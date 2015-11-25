package dataAccess;

import java.util.ArrayList;

public interface OptionsDAO {
	void saveOptions(ArrayList<String> Options, int dilemmaID) throws DALException;
	int getNextOptionID() throws DALException;
}
