package dataAccess;

public class UserDTO {
	
	int userID;
	String username, password, email;
	
	public UserDTO(int userID, String username, String password, String email) {
		this.userID = userID;
		this.username = username;
		this.password = password;
		this.email = email;
	}

}
