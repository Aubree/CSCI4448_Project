package model;

public abstract class Key extends Item{
	protected boolean transferable;

	public Key(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		super(item_name, item_state, late_fee_charge, item_id);
	}
	
	public boolean isTransferable() {
		return transferable;
	}

}
