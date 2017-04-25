package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FrontDesk {
	private ArrayList<DeskItem> deskItemsList;
	private ArrayList<TemporaryKey> temporaryKeyList;
	private String deskID;
	
	public FrontDesk() {
		// Default FrontDesk object (for testing purposes)
		deskItemsList = new ArrayList<DeskItem>();
		temporaryKeyList = new ArrayList<TemporaryKey>();
		deskID = "001";
		
		generateDefaultItems();
	}
	
	private void generateDefaultItems() {
		// Method to test items
		String item_name = "item";
		ItemState item_state = new CheckedIn();
		Integer late_fee_charge = 10;
		
		for (int i = 0; i < 10; i++) {
			deskItemsList.add(new DeskItem(item_name + i, item_state, late_fee_charge, i));
		}
	}
	
	public void AddDeskItem(DeskItem item) {
		deskItemsList.add(item);
	}
	
	public DeskItem getDeskItem(Integer itemID) {
		for (int i = 0; i < deskItemsList.size(); i++) {
			if (deskItemsList.get(i).getItemID() == itemID) {
				return deskItemsList.get(i);
			}
		}
		return null;
	}
	
	public Collection<DeskItem> getDeskItems() {
		return Collections.unmodifiableCollection(deskItemsList);
	}
	
	public String getDeskID() {
		return deskID;
	}
	
	public Key getTempKey(Integer itemId) {
		for (int i = 0; i < temporaryKeyList.size(); i++){
			if (temporaryKeyList.get(i).getItemID() == itemId){
				return temporaryKeyList.get(i);
			}
		}
		return null;
	}
	
	

}