package dataAccess;

public interface UserDAO {

	UserDAO getUser(int userID) throws DALException;
}
