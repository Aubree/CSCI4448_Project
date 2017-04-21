package model;

import java.util.ArrayList;

public class Room {
	private ArrayList<ResidentProfile> residentsList;
	private Integer roomNumber;
	private ArrayList<RoomAttribute> roomAttributes;
	private Integer maxOccupancy;
	private ArrayList<RoomConditionForm> rcfList;
	
	public Room() {
		// Default Room
		roomNumber = 555;
		maxOccupancy = 2;
	}
	
	public void addResident(ResidentProfile resident) {
		residentsList.add(resident);
	}
	
	public void removeResident(ResidentProfile resident) {
		residentsList.remove(resident);
	}
	
	public void addRoomAttribute(RoomAttribute attribute) {
		roomAttributes.add(attribute);
	}
	
	public void removeRoomAttribute(RoomAttribute attribute) {
		roomAttributes.remove(attribute);
	}
	
	public Integer getRoomNumber() {
		return roomNumber;
	}
	
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	public Integer getMaxOccupancy() {
		return maxOccupancy;
	}
	
	public void setMaxOccupancy(Integer maxOccupancy) {
		this.maxOccupancy = maxOccupancy;
	}


}
