package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.ResidentController;

import model.ResidentProfile;

public class ResidentRoomConditionFormGUI extends JFrame implements ActionListener {
	private ResidentController residentController;
	private GridBagConstraints layoutConstraints;
	
	private JLabel residentNameLabel;
	private JLabel residentRoomLabel;
	
	private RoomConditionFormTable roomConditionFormTable;
	
	private JButton editCommentButton;
	private JButton modifyStateButton;
	private JButton submitButton;
	
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public ResidentRoomConditionFormGUI(ResidentController resident_controller) {
		residentController = resident_controller;
		setTitle("Review Room Condition Form");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridBagLayout());
		layoutConstraints = new GridBagConstraints();
		buildGUI();
	}

	private void buildGUI() {
		residentNameLabel = new JLabel("Residet Name: " + 
				residentController.getUser().getFirstname() + " " + 
				residentController.getUser().getLastname());
		
		
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 3;
		layoutConstraints.gridheight = 1;
		add(residentNameLabel, layoutConstraints);
		
		
		residentRoomLabel = new JLabel("Room Number: " + 
				residentController.getUser().getResident_profile().getBuilding().getName() + " " + 
				residentController.getUser().getResident_profile().getPresentRoom().getRoomNumber());
		layoutConstraints.gridy = 1;
		add(residentRoomLabel, layoutConstraints);
		
		roomConditionFormTable = new RoomConditionFormTable(residentController);
		layoutConstraints.gridy = 2;
		layoutConstraints.gridwidth = 3;
		add (roomConditionFormTable, layoutConstraints);
		
		editCommentButton = new JButton("Edit Comment");
		editCommentButton.addActionListener(this);
		layoutConstraints.gridy = 3;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridwidth = 1;
		add(editCommentButton, layoutConstraints);
		
		modifyStateButton = new JButton("Change Condition");
		modifyStateButton.addActionListener(this);
		layoutConstraints.gridx = 1;
		add(modifyStateButton, layoutConstraints);
		
		submitButton = new JButton("Submit");
		submitButton.addActionListener(this);
		layoutConstraints.gridx = 2;
		add(submitButton, layoutConstraints);
		
		this.setVisible(true);
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		Object object = arg0.getSource();
		int item_id = roomConditionFormTable.getSelectedRow();
		String stateChoice = "";
		String commentChoice = "";
		Boolean isFinalized = residentController.getUser().getResident_profile()
				.getPresentRoom()
				.getRCF(residentController.getUser().getCu_id())
				.isFinalized(residentController.getUser().getResident_profile()
						.getPresentRoom().getRCF(residentController.getUser().getCu_id()));
		
		
		if (object == editCommentButton) {
			if(isFinalized.equals(true)){
				JOptionPane.showMessageDialog(null, "RCF is already submited, you can no longer change status");
			}
			
			else{
			commentChoice = JOptionPane.showInputDialog(null, "Please Edit Comment", "Edit Comment");
			residentController.changeComment(commentChoice, item_id);
			roomConditionFormTable.getModel().setValueAt(commentChoice, item_id, 3);
			System.out.println("Edit Comments Button Pushed");
			}
		}
		
		if (object == modifyStateButton) {
			if(isFinalized.equals(true)){
					JOptionPane.showMessageDialog(null, "RCF is already submited, you can no longer change status");
				}
			else {
			Object[] possibilities = {"MISSING", "BAD", "GOOD", "DAMAGED"};
			stateChoice = (String)JOptionPane.showInputDialog(
			                    null,
			                    "Pick new State\n",
			                    "Change State",
			                    JOptionPane.PLAIN_MESSAGE,
			                    null,
			                    possibilities,
			                    "GOOD");
			residentController.chageState(stateChoice, item_id);
			roomConditionFormTable.getModel().setValueAt(stateChoice, item_id, 2);
			System.out.println("Modify State Button Pushed");
			}	
		}
		
		
		if (object == submitButton) {
			int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to finalize your Room Condition Form?");
			if (choice == JOptionPane.YES_OPTION) {
				if(isFinalized.equals(true)){
					JOptionPane.showMessageDialog(null, "RCF is already submited");
				}
				else {
					residentController.getUser().getResident_profile()
					.getPresentRoom().getRCF(residentController.getUser().getCu_id()).finalize();
				}
				System.out.println("Submit Button Pushed");
			}
		}
		
	}

}
