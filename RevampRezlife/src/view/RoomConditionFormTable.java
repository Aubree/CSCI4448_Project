package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.RoomConditionForm;

import controller.ResidentController;

public class RoomConditionFormTable extends JTable {
	private DefaultTableModel itemTableModel;
	private ResidentController residentController;
	private RoomConditionForm roomConditionForm;
	
	
	
	public RoomConditionFormTable(ResidentController resident_controller) {
		residentController = resident_controller;
		//roomConditionForm = residentController.getUser().getResident_profile().getPresentRoom()
		
	}
}
