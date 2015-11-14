package dataAccess;

import java.util.Date;

public class DilemmaDTO {

	int dilemmaID, userID;
	String title, description;
	Date date;
	
	public DilemmaDTO(int userID, String title, String description, Date date) {
		this.userID = userID;
		this.title = title;
		this.description = description;
		this.date = date;
	}
	
	public int getDilemmaID() {
		return dilemmaID;
	}
	
	public void setDilemmaID(int ID) {
		this.dilemmaID = ID;
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
	
	public Date getDate() {
		return date;
	}
}
