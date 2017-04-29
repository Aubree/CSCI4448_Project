package model;

public class DeskItem extends Item {

	public DeskItem(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		super(item_name, item_state, late_fee_charge, item_id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		String item_string = itemID + "," + itemName + "," +  itemState.toString() + "," + lateFeeCharge + "\n";
		return item_string;
	}

}
