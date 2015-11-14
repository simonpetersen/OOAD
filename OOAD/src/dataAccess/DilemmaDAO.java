package dataAccess;

import java.util.List;

public interface DilemmaDAO {
	DilemmaDTO getDilemma(int dilemmaID) throws DALException;
	void createDilemma(DilemmaDTO dilemma) throws DALException;
	int getNextDilemmaID() throws DALException;
}
