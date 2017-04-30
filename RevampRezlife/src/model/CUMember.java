package model;

import java.util.ArrayList;

import view.ResidentAdvisorTab;

public class CUMember {
	private String password;
	private String username;
	private String firstname;
	private String lastname;
	private String email;
	private String gender;
	private String phone_number;
	private Integer cu_id;
	private ResidentProfile resident_profile;
	private ArrayList<CU_Job> job_list;
	public static ArrayList<CUMember> member_list = new ArrayList<CUMember>();
	public static Integer IDNumber = 0;
	
	public CUMember(String password, String username, String firstname, String lastname, String gender, String phone_number) {
		this.password = password;
		this.username = username;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = firstname + "." + lastname + "@colorado.edu";
		this.gender = gender;
		this.phone_number = phone_number;
		this.cu_id = IDNumber;
		CUMember.incrementID();
		this.resident_profile = null;	
		job_list = new ArrayList<CU_Job>();
	}
	
	public CUMember() {
		// Default CUMember is an RA (and thus also a CA) thus has a Resident Profile and two jobs
		firstname = "John";
		lastname = "Downer";
		email = firstname + "." + lastname + "@colorado.edu";
		gender = "female";
		phone_number = "555-555-5555";
		cu_id = 123456789;
		resident_profile = new ResidentProfile(this);	
		job_list = new ArrayList<CU_Job>();
		job_list.add(new ResidentAdvisor());
		job_list.add(new CommunityAssistant());
	}
	
	public static void addUser(CUMember newbie){
		member_list.add(newbie);
	}
	
	public static CUMember lookUpUser(String username, String password){
		for(int i=0; i < member_list.size(); i++){
			if(member_list.get(i).getPassword().equals(password) && member_list.get(i).getUserName().equals(username)){
				return member_list.get(i);
			}
		}
		return null;
	}
	
	public String getPassword(){
		return password;
	}
	public String getUserName(){
		return username;
	}
	
	public void addJob(CU_Job position){
		job_list.add(position);
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
	
	public CUMember getCUMemberFromUsername(String username) {
		CUMember member = new CUMember();
		return member;
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
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
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

	public static void incrementID() {
		// TODO Auto-generated method stub
		IDNumber += 1;
	}
}
