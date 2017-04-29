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

	public DeskItem getItemFromString(String line_in) {
		String[] tokens = line_in.split(",");
		String itemname;
		Integer itemid;
		Integer itemfeecharge;
		ItemState itemstate = new CheckedIn();
		
		itemid = Integer.parseInt(tokens[0]);
		itemname = tokens[1];
		
		String itemstatestring = tokens[2];
		if (itemstatestring.equals("Checked In")) {
			itemstate = new CheckedIn();
		}
		if (itemstatestring.equals("Checked Out")) {
			itemstate = new CheckedOut();
		}
		if (itemstatestring.equals("Overdue")) {
			itemstate = new Overdue();
		}
		
		itemfeecharge = Integer.parseInt(tokens[3]);
		
		
		
		
		return new DeskItem(itemname, itemstate, itemfeecharge, itemid);
	}

}
