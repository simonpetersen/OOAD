package dataAccess;

public class DBInitialiser {

	public void init() throws DALException {
		Connector.doUpdate("DROP TABLE if EXISTS dilemma");
		Connector.doUpdate("DROP TABLE if EXISTS user");
		Connector.doUpdate("DROP TABLE if EXISTS options");
		
		Connector.doUpdate("CREATE TABLE user ()");
		
		Connector.doUpdate("CREATE TABLE dilemma (dilemmaID INTEGER PRIMARY KEY, userID INTEGER, title VARCHAR(30), "
				+ "description VARCHAR(50), seriousness INTEGER, time DATETIME, "
				+ "category VARCHAR(20), FOREIGN KEY (userID) REFERENCES user(userID)");
		
		//.doUpdate("CREATE TABLE Player (Player_ID INTEGER PRIMARY KEY, Name VARCHAR(20), Account INTEGER, Jailcard INTEGER, Field INTEGER, turnsInJail INTEGER)");
	}
	
}
