package view;

import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.DeskItem;
import model.ItemState;

import controller.CommunityAssistantController;
import controller.ResidentController;

public class ItemTable extends JTable {
	private DefaultTableModel itemTableModel;
	
	
	public ItemTable(ResidentController resident_controller) {
		ArrayList<DeskItem> desk_items = (ArrayList<DeskItem>) resident_controller.viewDeskItems();
		itemTableModel = new DefaultTableModel();
		
		String header[] = new String[] {"Item Name", "Current Status"};
		itemTableModel.setColumnIdentifiers(header);
		setModel(itemTableModel);
		
		for (int i = 0; i < desk_items.size(); i++) {
			DeskItem item = desk_items.get(i);
			String item_name = item.getItemName();
			ItemState item_state = item.getItemState();
			itemTableModel.addRow(new Object[] {item_name, item_state});
		}
		
		setFillsViewportHeight(false);
	}
	
	public ItemTable(CommunityAssistantController ca_controller) {
		ArrayList<DeskItem> desk_items = (ArrayList<DeskItem>) ca_controller.viewDeskItems();
		itemTableModel = new DefaultTableModel();
		
		String header[] = new String[] {"Item Name", "Current Status"};
		itemTableModel.setColumnIdentifiers(header);
		setModel(itemTableModel);
		
		for (int i = 0; i < desk_items.size(); i++) {
			DeskItem item = desk_items.get(i);
			String item_name = item.getItemName();
			ItemState item_state = item.getItemState();
			itemTableModel.addRow(new Object[] {item_name, item_state});
		}
		
		setFillsViewportHeight(false);
	}

}
