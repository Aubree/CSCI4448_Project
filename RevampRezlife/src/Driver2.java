import view.*;
import model.*;


public class Driver2 {
	
	
	public static void main(String[] args) {
		setup();
		LogInGUI login = new LogInGUI();
	}
	
	public static void setup(){
		Building Farr = new Building();
		Building Stearns = new Building();
		
		Room one = new Room(Farr, 1, 2);
		Room two = new Room(Farr, 2, 2);
		
		Room three = new Room(Stearns, 3, 2);
		Room four = new Room(Stearns, 4, 2);
		
		CUMember jason = new CUMember("pass", "jahi3695", "Jason", "Hill", "male?", "303-957-4532", 123);
		CUMember.addUser(jason);
		ResidentProfile hey = new ResidentProfile(jason, Farr, one);
		jason.setResident_profile(hey);
	}
}
