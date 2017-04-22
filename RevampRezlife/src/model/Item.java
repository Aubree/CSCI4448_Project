package model;

public abstract class Item {
	private String itemName;
	private ItemState itemState;
	private Integer lateFeeCharge;
	private Integer itemID;
	
	public Item(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		itemName = item_name;
		item_state = itemState;
		lateFeeCharge = late_fee_charge;
		itemID = item_id;
	}
	
	public String getItemName() {
		return itemName;
	}

	public Integer getLateFeeCharge() {
		return lateFeeCharge;
	}

	public Integer getItemID() {
		return itemID;
	}

	public ItemState getItemState() {
		return itemState;
	}

	public void setItemState(ItemState itemState) {
		this.itemState = itemState;
	}

}
