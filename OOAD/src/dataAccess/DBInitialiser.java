package dataAccess;

public class DBInitialiser {

	public void createDB() throws DALException {
		Connector.doUpdate("DROP TABLE if EXISTS options");
		Connector.doUpdate("DROP TABLE if EXISTS dilemma");
		Connector.doUpdate("DROP TABLE if EXISTS user");
		
		Connector.doUpdate("CREATE TABLE user (userID INTEGER PRIMARY KEY, email varchar(30), username varchar(30), password varchar(20))");
		
		Connector.doUpdate("CREATE TABLE dilemma (dilemmaID INTEGER PRIMARY KEY, userID INTEGER, title VARCHAR(30), "
				+ "description VARCHAR(50), seriousness INTEGER, time DATETIME, "
				+ "category VARCHAR(20), FOREIGN KEY (userID) REFERENCES user(userID))");
		
		Connector.doUpdate("CREATE TABLE options (optionID INTEGER PRIMARY KEY, dilemmaID INTEGER, answerOption VARCHAR(40), numberChosen INTEGER, FOREIGN KEY(dilemmaID) REFERENCES dilemma(dilemmaID))");
		
		Connector.doUpdate("INSERT INTO user VALUES(1, 'gruppe8@dtu.dk', 'dilemmaKnuser8', '123456')");
	}
	
}
