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
		// TODO Auto-generated method stub
		
	}

}
