package model;

public class CheckedOut implements ItemState {
	
	
	public void charge() {
		
	}

	@Override
	public void update(String checkout_date, String due_date) {
		// TODO Auto-generated method stub
		
	}
	
	public String toString() {
		return "Checked Out";
	}


	public Boolean isAvailableForCheckout() {
		return false;
	}
}
