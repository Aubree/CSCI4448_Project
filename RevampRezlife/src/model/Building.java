package model;

import java.util.List;
import java.util.ArrayList;

public class Building {
	private Room roomsList;
	private String name;
	private Integer max_occupancy;
	private List<FrontDesk> front_desk = new ArrayList<FrontDesk>();
	private List<CU_Job> staff = new ArrayList<CU_Job>();
	
	public Boolean getRoomAvailability(){
		//if room availability is open return TRUE
		//else return FALSE
		//ca this getter be a one liner?
		return true;
	}
	public void addRoom(Room roomsList){
		//roomList.add()
		//add room to roomsList
	}
	public Room getRoomList(){
		return roomsList;
	}
	public RoomAttribute getRoom(Integer roomnumber){
		//filler until I figure out wtf im doing
		RoomAttribute one;
		return one;
	}
	public String getName(){
		return name;
	}
	public void addFrontDesk(){ //should this be nothing or deskId
		//add front desk to List<FrontDesk>
	}
	public void addStaffMember(CU_Job cu_jobs){
		//I know...
	}
	public String getStaffMember(String CU_id){
		return CU_id;
	}
	//getStaffList()
	public FrontDesk getFrontDesk(Integer deskId){
		FrontDesk two;
		return two;
	}
	
}
