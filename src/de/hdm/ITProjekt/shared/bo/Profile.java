package de.hdm.ITProjekt.shared.bo;

public class Profile extends BusinessObject {
	
	private static final long serialVersionUID = 1L;
	

	private String firstName = "";
	
	private String lastName = "";
	
	private int birthDay = 0; /** m�ssen nachschauen wie wir das mit dem Geburtsdatum machen*/
	
	private String hairColor = "";
	
	private double bodyHeight;
	
	private boolean smoker;
	
	private boolean nonsmoker;
	
	private String religiousDenomination = "";
	
	private String email = "";
	
	private String password = "";
	
	private boolean male;
	
	private boolean female;
	
	
	
	
	public String getFirstName() {
		return this.firstName;	
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public void setLastName (String name) {
		this.lastName = name;
	}
	
	/* geburtsdatum*/
	
	public String getHairColor() {
		return this.hairColor;
	}
	
	public void setHairColor (String haarfarbe) {
		this.hairColor = haarfarbe;
	}
	
	public double getBodyHeight() {
		return this.bodyHeight;
	}
	
	public void setBodyHeight (double koerpergroe�e){
		this.bodyHeight = koerpergroe�e;
	}
	
	public boolean isSmoker() {
		return smoker;
	}
	
	public void setSmoker(boolean raucher){
		this.smoker = raucher;
	}
	
	public boolean isNonsmoker() {
		return nonsmoker;
	}
	
	/* ich wei� nicht ob wir noch ne setmethode brauchen f�r die boolean Sachen*/
	
	public String getReligiousDenomination() { /* wir sollten glaub das anders benennen*/
		return this.religiousDenomination;
	}
	
	public void setReligiousDenomination (String religion) {
		this.religiousDenomination = religion;
	}
	
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail (String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public void setPassword (String password) {
		this.password = password;
	}
	

	public boolean isMale(){
		return male;	
	}
	
	public boolean isFemale() {
		return female;
	}
		
}
