package dataAccess;

public interface UserDAO {

	User getUser(String email) throws DALException;
}
