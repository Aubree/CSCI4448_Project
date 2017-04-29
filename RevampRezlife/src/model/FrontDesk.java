package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
	private void readDeskItemsFromFile() {
		String line;
		try {
			FileReader fr = new FileReader(DeskItem.storageFileName);
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void writeDeskItemsToFile() {
		String filename = DeskItem.storageFileName;
		try {
			filename = new File(filename).getAbsolutePath();
			FileWriter fw = new FileWriter(filename);
			fw.write(deskItemsList.get(0).toString());
			fw.close();
			for (int i = 1; i < deskItemsList.size(); i++) {
				appendDeskItemToFile(deskItemsList.get(i));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void appendDeskItemToFile(DeskItem item) {
		try {
			FileWriter fw = new FileWriter(item.getStorageFileName(), true);
			fw.append(item.toString());
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void generateDefaultItems() {
		// Method to test items
		String item_name = "item";
		ItemState item_state = new CheckedIn();
		Integer late_fee_charge = 10;
		
		for (int i = 0; i < 10; i++) {
			addDeskItem(new DeskItem(item_name + i, item_state, late_fee_charge, i));
		}
	}
	
	public void addDeskItem(DeskItem item) {
		deskItemsList.add(item);
		writeDeskItemsToFile();
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