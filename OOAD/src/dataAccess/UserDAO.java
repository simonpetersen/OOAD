package dataAccess;

public interface UserDAO {

	UserDTO getUser(String email) throws DALException;
}
