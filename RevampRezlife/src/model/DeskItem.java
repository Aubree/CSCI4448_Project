package model;

public class DeskItem extends Item {
	
	public DeskItem() {
		super("", new CheckedIn(), 1, 1);
		storageFileName = "storage/deskitems.txt";
	}

	public DeskItem(String item_name, ItemState item_state, Integer late_fee_charge, Integer item_id) {
		super(item_name, item_state, late_fee_charge, item_id);
		
	}

	@Override
	public String toString() {
		String item_string = itemID + "," + itemName + "," +  itemState.toString() + "," + lateFeeCharge + "\n";
		return item_string;
	}

	@Override
	public Item getItemFromString(String line_in) {
		String[] tokens = line_in.split(",");
		String itemname;
		Integer itemid;
		Integer itemfeecharge;
		ItemState itemstate;
		
		for (int i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		return null;
	}

}
