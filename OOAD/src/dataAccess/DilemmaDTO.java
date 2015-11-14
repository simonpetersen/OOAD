package dataAccess;

import java.util.Date;

public class DilemmaDTO {

	int dilemmaID, userID;
	String title, description;
	Date date;
	
	public DilemmaDTO(String title, String description, int minutes) {
		this.userID = 1;
		this.title = title;
		this.description = description;
		this.date = new Date(new Date().getTime()+minutes*60*60);
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
