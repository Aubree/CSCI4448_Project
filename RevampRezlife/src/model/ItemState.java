package model;

public interface ItemState {
	public void charge();
	public void update(String checkout_date, String due_date);
	public String toString();
}
