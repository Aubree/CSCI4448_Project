package model;

import java.util.ArrayList;

public class ResidentAdvisor extends CU_Job{
	
	private ArrayList<ResidentProfile> resident_list;
	
	public ResidentAdvisor() {
		this.job_title = "Resident Advisor";
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
}
