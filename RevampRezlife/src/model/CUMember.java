package model;

import java.util.ArrayList;

public class CUMember {
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private Integer phone_number;
	private Integer cu_id;
	private ResidentProfile resident_profile;
	private ArrayList<CU_Job> job_list;
	
	public CUMember(String username, String password) {
		// load profile from database
		job_list = new ArrayList<CU_Job>();
		resident_profile = new NullResidentProfile();
		
	}
	
	public static boolean isValidUser(String username, String password) {
		
		return true;
	}
	
	public boolean hasResidentProfile() {
		if(resident_profile.getClass().equals(NullResidentProfile.class)) {
			return false;
		}
		else {
			return true;
		}
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(Integer phone_number) {
		this.phone_number = phone_number;
	}
	public Integer getCu_id() {
		return cu_id;
	}
	public void setCu_id(Integer cu_id) {
		this.cu_id = cu_id;
	}
	public ResidentProfile getResident_profile() {
		return resident_profile;
	}
	public void setResident_profile(ResidentProfile resident_profile) {
		this.resident_profile = resident_profile;
	}
	public ArrayList<CU_Job> getJob_list() {
		return job_list;
	}
	public void setJob_list(ArrayList<CU_Job> job_list) {
		this.job_list = job_list;
	}

	

}
