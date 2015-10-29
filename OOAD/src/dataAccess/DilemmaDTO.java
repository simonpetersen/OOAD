package dataAccess;

public class DilemmaDTO implements DilemmaDAO {

	int dilemmaID, userID;
	String title, description;
	
	
	public DilemmaDTO getDilemma(int dilemmaID) throws DALException {
		return null;
	}
	
	public void createDilemma(DilemmaDTO dilemma) throws DALException {
		
	}
}
