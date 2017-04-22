package model;

public interface ItemState {
	public void charge();
	public ItemState getState();
	public void update(String checkout_date, String due_date);
}
