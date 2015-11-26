package dataAccess;

import model.Dilemma;

public interface DilemmaDAO {
	Dilemma getDilemma(int dilemmaID) throws DALException;
	void createDilemma(Dilemma dilemma) throws DALException;
	int getNextDilemmaID() throws DALException;
}
