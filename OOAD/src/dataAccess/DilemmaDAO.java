package dataAccess;

public interface DilemmaDAO {
	DilemmaDTO getDilemma(int dilemmaID) throws DALException;
	void createDilemma(DilemmaDTO dilemma) throws DALException;
	int getNextDilemmaID() throws DALException;
}
