package model;

public class CheckedIn implements ItemState {
	
	public void charge() {
	}

	@Override
	public void update(String checkout_date, String due_date) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return new String("Checked In");
	}
}
