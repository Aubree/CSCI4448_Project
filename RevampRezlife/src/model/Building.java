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
		RoomAttribute one = new RoomAttribute();
		return one;
	}
	public String getName(){
		return name;
	}
	public void addFrontDesk(){ //should this be nothing or deskId
		//add front desk to List<FrontDesk>
	}
<<<<<<< HEAD
	public void addStaffMember(CU_Job cu_jobs){
=======
	public void addStaffMember(CU_Job job){
>>>>>>> 6fec74a122a709a2f2b8b247583ff3dd97af66c2
		//I know...
	}
	public String getStaffMember(String CU_id){
		return CU_id;
	}
	//getStaffList()
	public FrontDesk getFrontDesk(Integer deskId){
		FrontDesk two = new FrontDesk();
		return two;
	}
<<<<<<< HEAD
=======
	

>>>>>>> 6fec74a122a709a2f2b8b247583ff3dd97af66c2
	
}
