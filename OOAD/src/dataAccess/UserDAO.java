package dataAccess;

import model.User;

public interface UserDAO {

	User getUser(String email) throws DALException;
}
