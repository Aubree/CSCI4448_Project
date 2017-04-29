package model;

import java.io.FileWriter;
import java.io.IOException;

public abstract class Item {
	protected String itemName;
	protected ItemState itemState;
	protected Integer lateFeeCharge;
	protected Integer itemID;
	protected static String storageFileName;
	
	public Item(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		itemName = item_name;
		itemState = item_state;
		lateFeeCharge = late_fee_charge;
		itemID = item_id;
	}
	
	public abstract String toString();
	
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
	
	public String getStorageFileName() {
		return storageFileName;
	}

	private void setItemState(ItemState itemState) {
		this.itemState = itemState;
	}
	
	public Boolean isAvailableForCheckout() {
		return this.itemState.isAvailableForCheckout();
	}
	
	public void checkoutItem() {
		setItemState(new CheckedOut());
	}
	
	public void checkInItem() {
		setItemState(new CheckedIn());
	}
	
	public abstract Item getItemFromString(String line_in);
	

	

}
