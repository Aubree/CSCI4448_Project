package model;

public class CU_Job {
	protected String job_title;
	
	public CU_Job() {
		job_title = "Employee";
	}
	
	public CU_Job(Integer cu_id) {
		
	}

	public String getJob_title() {
		return job_title;
	}

	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	
}
