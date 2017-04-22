package model;

public class TemporaryKey extends Key {

	public TemporaryKey(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		super(item_name, item_state, late_fee_charge, item_id);
		transferable = true;
	}

}
