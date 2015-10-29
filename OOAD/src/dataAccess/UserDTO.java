package dataAccess;

public class UserDTO implements UserDAO {
	
	int userID;
	String userName, pasword, email;

	public UserDAO getUser(int userID) throws DALException {
		return null;
	}
	public UserDAO getUserName(String userName) throws DALException{
		return null;
	}
	public UserDAO getPasword(String pasword) throws DALException {	
		return null;
	}
	public UserDAO getEmail(String email) throws DALException {
		return null;
	}

}
