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
		rcfList = new ArrayList<RoomConditionForm>();
		roomAttributes = new ArrayList<RoomAttribute>();
		generateRoomAttribute();
	}
	
	public void generateRoomAttribute(){
		String item_name = "item";
		
		for (int i = 0; i < 10; i++) {
			roomAttributes.add(new RoomAttribute(item_name + i));
		}
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
	
	private void generateRCF(Integer CU_Id){
		//adds attributes to rcf
		RoomConditionForm newRCF = new RoomConditionForm(roomAttributes, CU_Id);
		rcfList.add(newRCF);
	}
	
	public RoomConditionForm getRCF(Integer CU_Id){
		for (int i = 0; i < rcfList.size(); i++) {
			if (rcfList.get(i).getCU_Id().equals(CU_Id)){
				return rcfList.get(i);
			}
		}
		generateRCF(CU_Id);
		return getRCF(CU_Id);
	}

}
