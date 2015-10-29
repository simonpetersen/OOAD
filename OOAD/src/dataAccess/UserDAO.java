package dataAccess;

public interface UserDAO {

	UserDAO getUser(int userID) throws DALException;
	UserDAO getPasword(String pasword) throws DALException;
	UserDAO getEmail(String email) throws DALException;
}
