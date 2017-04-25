package model;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Building {
	private ArrayList<Room> roomsList = new ArrayList<Room>();
	private String name;
	private Integer max_occupancy;
	private ArrayList<FrontDesk> front_desk = new ArrayList<FrontDesk>();
	private ArrayList<CU_Job> staff = new ArrayList<CU_Job>();
	
	public Building() {
		// Default Building Object
		name = "Stearns East";
		front_desk.add(new FrontDesk());
		
	}
	
	public Boolean getRoomAvailability(){//doesn't this has to pass in roomsList
		//if room availability is open return TRUE
		//else return FALSE
		//ca this getter be a one liner?
		//for(int i = 0; i < roomsList.size(); i++ ){
			
		//}
		return true;
	}
	public void addRoom(Room roomsList){
		//roomList.add()
		//add room to roomsList
	}
	public ArrayList<Room> getRoomList(){
		return roomsList;
	}
	public Room getRoom(Integer roomnumber){
		//filler until I figure out wtf im doing
		if(roomsList.size() < roomnumber) {
			return null;
		}
		else {
			return roomsList.get(roomnumber);
		}
	}
	public String getName(){
		return name;
	}
	public void addFrontDesk(){ //should this be nothing or deskId
		//add front desk to List<FrontDesk>
	}
	public void addStaffMember(CU_Job cu_jobs){
		
	}
	public String getStaffMember(String CU_id){
		return CU_id;
	}
	//getStaffList()
	public ArrayList<FrontDesk> getFrontDesks(){
		return front_desk;
	}
	
}