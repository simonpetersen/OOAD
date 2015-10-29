package dataAccess;

public class UserDTO implements UserDAO {
	
	int userID;
	String userName, pasword, email;

	public UserDAO getUser(int userID) throws DALException {
		return null;
	}

}
