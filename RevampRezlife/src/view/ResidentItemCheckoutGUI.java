package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.DefaultTableModel;

import controller.ResidentController;
import model.CUMember;
import model.DeskItem;
import model.ItemState;
import model.ResidentProfile;

public class ResidentItemCheckoutGUI extends JFrame implements ActionListener {
	private ResidentProfile residentProfile;
	private ResidentController residentController;
	private GridBagConstraints layoutConstraints;
	
	private ItemTable itemTable;
	private DefaultTableModel itemTableModel;
	private JScrollPane tableScrollPane;
	
	private JButton request_item_button;
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public ResidentItemCheckoutGUI(ResidentController resident_controller) {
		residentController = resident_controller;
		residentProfile = residentController.getUser().getResident_profile();
		layoutConstraints = new GridBagConstraints();
		setTitle("Item Checkout");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridBagLayout());
		buildGUI();
	}

	private void buildGUI() {
		itemTable = new ItemTable(residentController);
		tableScrollPane = new JScrollPane(itemTable);
		
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		
		
		add(tableScrollPane, layoutConstraints);
		
		request_item_button = new JButton("Request Selected Item");
		request_item_button.addActionListener(this);
		layoutConstraints.gridy = 1;
		add(request_item_button, layoutConstraints);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		Object object = arg0.getSource();
		if (object == request_item_button) {
			System.out.println("Request Item Button Pressed");
		}
	}

}
