package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.RoomConditionForm;

import controller.ResidentController;

public class RoomConditionFormTable extends JTable {
	private DefaultTableModel rcfTableModel;
	private ResidentController residentController;
	private RoomConditionForm roomConditionForm;
	
	
	
	public RoomConditionFormTable(ResidentController resident_controller) {
		residentController = resident_controller;
		roomConditionForm = residentController.getUser()
				.getResident_profile()
				.getPresentRoom()
				.getRCF(residentController
						.getUser().getCu_id());
		
		String header[] = new String[] {"Room Item", "Description", "Condition", "Comment"};
		rcfTableModel = new DefaultTableModel();
		rcfTableModel.setColumnIdentifiers(header);
		setModel(rcfTableModel);
		
	}
}
