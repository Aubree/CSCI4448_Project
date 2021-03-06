import java.util.ArrayList;

import view.*;
import model.*;


public class Driver2 {
	
	
	public static void main(String[] args) {
		setup();
		LogInGUI login = new LogInGUI();
	}
	
	public static void setup(){
		Building Farr = new Building("Farr");
		Building Stearns = new Building("Stearns");
		System.out.print(Farr.getName()); 
		Building.addBuilding(Farr);
		Building.addBuilding(Stearns);
		
		Room one = new Room(Farr, 1, 1);
		Room two = new Room(Farr, 2, 2);
		Farr.addRoom(one);
		Farr.addRoom(two);
		
		Room three = new Room(Stearns, 3, 2);
		Room four = new Room(Stearns, 4, 2);
		Stearns.addRoom(three);
		Stearns.addRoom(four);
		
		ArrayList<Room> rooms = new ArrayList<Room>();
		rooms.add(one);
		rooms.add(two);
		
		CUMember jason = new CUMember("pass", "jahi3695", "Jason", "Hill", "male?", "303-957-4532");
		CUMember.addUser(jason);
		CUMember blank = new CUMember("","","Aubree", "Lytwyn","female", "123-456-7890");
		ResidentProfile hey = new ResidentProfile(jason, Farr, one);
		jason.setResident_profile(hey);
		
		jason.addJob(new ResidentAdvisor(rooms));
		jason.addJob(new CommunityAssistant());
	}
}
