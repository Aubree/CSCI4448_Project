package model;

import java.util.ArrayList;

public class ResidentAdvisor extends CU_Job{
	
	private ArrayList<ResidentProfile> resident_list;
	private ArrayList<Room> room_list;
	
	public ResidentAdvisor() {
		this.job_title = "Resident Advisor";
	}
	
	public ResidentAdvisor(ArrayList<Room> rooms) {
		// TODO Auto-generated constructor stub
		this.job_title = "Resident Advisor";
		room_list = rooms;
	}

	public ArrayList<ResidentProfile> getResidents(){
		return resident_list;
	}
	public void addResident(ResidentProfile newbie){
		resident_list.add(newbie);
	}
	public void removeResident(ResidentProfile outie){
		resident_list.remove(outie);
	}

	public void addRooms(Room one) {
		// TODO Auto-generated method stub
		room_list.add(one);	
	}
}
