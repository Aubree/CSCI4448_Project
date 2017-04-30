package model;

import java.util.ArrayList;

public class ResidentProfile {
	private Room studentRoom;
	private Building building;
	private ArrayList<Item> deskItemHistory;
	private ArrayList<Key> keyHistory;
	private RoommateAgreement roommateAgreement;
	private String firstname;
	private String lastname;
	private String email;
	private String phoneNumber;
	
	public ResidentProfile(CUMember user) {
		// Default Resident Profile
		building = new Building();
		studentRoom = new Room();
		deskItemHistory = new ArrayList<Item>();
		keyHistory = new ArrayList<Key>();
		roommateAgreement = new RoommateAgreement();
		firstname = user.getFirstname();
		lastname = user.getLastname();
		email = user.getEmail();
		phoneNumber = user.getPhone_number();
	}
	
	public ResidentProfile(CUMember user, Building building, Room room) {
		// Default Resident Profile
		this.building = building;
		studentRoom = room;
		studentRoom.addResident(user); // now the room shows up as having someone in it. 
		//In reality you would want some error checking so that if the room were already at capacity, 
		//it would deny this call and throw and throw a recoverable error.
		//are we updating the room to reflect that someone is living there?
		deskItemHistory = new ArrayList<Item>();
		keyHistory = new ArrayList<Key>();
		roommateAgreement = new RoommateAgreement();
		firstname = user.getFirstname();
		lastname = user.getLastname();
		email = user.getEmail();
		phoneNumber = user.getPhone_number();
	}

	public Room getStudentRoom() {
		return studentRoom;
	}

	public void setStudentRoom(Room studentRoom) {
		this.studentRoom = studentRoom;
	}

	public Building getBuilding() {
		return building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public RoommateAgreement getRoommateAgreement() {
		return roommateAgreement;
	}

	public void setRoommateAgreement(RoommateAgreement roommateAgreement) {
		this.roommateAgreement = roommateAgreement;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	//not normal getters and setters
	public  ArrayList<Key> getKeyHistory() {
		return keyHistory;
		
	}
	
	public ArrayList<Item> getRoomHistory() {
		return deskItemHistory;
	}
	
	public void addKey(Key key){
		keyHistory.add(key);
	}
	
	public void addRoom(){
		Room newRoom = new Room();
		studentRoom = newRoom;
	}
	public Key getPresentKey(){
		return keyHistory.get(keyHistory.size() -1);
	}
	public Room getPresentRoom(){
		return studentRoom;
		
	}
}