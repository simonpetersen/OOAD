package model;

import java.util.Date;

public class Dilemma {

	int dilemmaID, userID, seriousness;
	String title, description, category;
	Date date;
	
	public Dilemma() { }
	
	public Dilemma(String title, String description, String category, int minutes, int seriousness) {
		this.userID = 1;
		this.title = title;
		this.description = description;
		this.category = category;
		this.seriousness = seriousness;
		this.date = new Date(new Date().getTime()+minutes*60*1000);
	}
	
	public Dilemma(String title, String description, String category, int seriousness) {
		this.userID = 1;
		this.title = title;
		this.description = description;
		this.category = category;
		this.seriousness = seriousness;
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
	
	public String getCategory() {
		return category;
	}
	
	public Date getDate() {
		return date;
	}
	
	public int getSeriousness() {
		return seriousness;
	}
}
