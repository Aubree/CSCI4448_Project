package model;

public class BuffOneCard extends Key {

	public BuffOneCard(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		super(item_name, item_state, late_fee_charge, item_id);
		transferable = false;
	}
	
}
