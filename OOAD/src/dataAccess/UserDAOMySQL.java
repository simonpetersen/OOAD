package dataAccess;

import java.sql.ResultSet;
import java.sql.SQLException;

import model.User;

public class UserDAOMySQL implements UserDAO {

	public User getUser(String email) throws DALException {
		ResultSet rs = Connector.doQuery("SELECT * FROM user where email = '"+email+"';");
		try {
			if (!rs.first())
				throw new DALException("The email " + email + "does not exist.");
			return new User(rs.getInt("userID"), rs.getString("email"),
					rs.getString("username"), rs.getString("password"));
		} catch (SQLException e) {
			throw new DALException(e);
		}
	}

}
