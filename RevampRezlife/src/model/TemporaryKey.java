package model;

public class TemporaryKey extends Key {

	public TemporaryKey(String temp_name, ItemState temp_state, Integer late_fee_charge, Integer temp_num) {
		super(temp_name, temp_state, late_fee_charge, temp_num);
		storageFileName = "storage/tempInfo.txt";
		transferable = true;
	}
	

	@Override
	public String toString() {
		String temp_string = itemName + "," +  itemState.toString() + "," + lateFeeCharge + "," + itemID + "\n";
		return temp_string;
	}

	@Override
	public Item getItemFromString(String line_in) {
		String[] tokens = line_in.split(",");
		String tempname;
		Integer tempnum;
		Integer tempfeecharge;
		ItemState tempstate = new CheckedIn();
		
		tempnum = Integer.parseInt(tokens[0]);
		tempname = tokens[1];
		
		String itemstatestring = tokens[2];
		if (itemstatestring.equals("Checked In")) {
			tempstate = new CheckedIn();
		}
		if (itemstatestring.equals("Checked Out")) {
			tempstate = new CheckedOut();
		}
		if (itemstatestring.equals("Overdue")) {
			tempstate = new Overdue();
		}
		
		tempfeecharge = Integer.parseInt(tokens[3]);
		
		return new TemporaryKey(tempname, tempstate, tempfeecharge, tempnum);
	}

}
