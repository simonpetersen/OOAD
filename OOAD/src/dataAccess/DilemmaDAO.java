package dataAccess;

import java.util.List;

public interface DilemmaDAO {
//	PlayerDTO getPlayer(int playerID) throws DALException;
//	List<PlayerDTO> getPlayerList() throws DALException;
//	void createPlayer(PlayerDTO player) throws DALException;
//	void updatePlayer(PlayerDTO player) throws DALException;
//	void deletePlayer(int playerID) throws DALException;
//	int getJailCards() throws DALException;
	
	DilemmaDTO getDilemma(int dilemmaID) throws DALException;
	void createDilemma(DilemmaDTO dilemma) throws DALException;
	
}
