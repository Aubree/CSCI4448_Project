package model;

public class CommunityAssistant extends CU_Job {
	private Building buildingWorked;
	public CommunityAssistant() {
		this.job_title = "Community Assistant";
		this.buildingWorked = new Building();
	}
	
	public Building getBuildingWorked() {
		return buildingWorked;
	}
	
	

}
