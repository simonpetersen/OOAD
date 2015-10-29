package dataAccess;

public class DilemmaDTO {

	int dilemmaID, userID;
	String title, description;
	
	public DilemmaDTO(int dilemmaID, int userID, String title, String description) {
		this.dilemmaID = dilemmaID;
		this.userID = userID;
		this.title = title;
		this.description = description;
	}
	
	public int getDilemmaID() {
		return dilemmaID;
	}
	
	public int getUserID() {
		return userID;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDescription() {
		return description;
	}
}
