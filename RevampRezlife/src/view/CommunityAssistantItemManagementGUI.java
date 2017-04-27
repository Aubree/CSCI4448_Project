package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.ResidentProfile;
import controller.CommunityAssistantController;

public class CommunityAssistantItemManagementGUI extends JFrame implements ActionListener {
	private CommunityAssistantController caController;
	private GridBagConstraints layoutConstraints;
	
	private ItemTable itemTable;
	private DefaultTableModel itemTableModel;
	private JScrollPane tableScrollPane;
	
	private JButton checkout_item_button;
	private JButton check_in_item_button;
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public CommunityAssistantItemManagementGUI(CommunityAssistantController ca_controller) {
		caController = ca_controller;
		layoutConstraints = new GridBagConstraints();
		setTitle("Item Checkout");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridBagLayout());
		buildGUI();
	}

	private void buildGUI() {
		itemTable = new ItemTable(caController);
		tableScrollPane = new JScrollPane(itemTable);
		
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 2;
		layoutConstraints.gridheight = 1;
		
		
		add(tableScrollPane, layoutConstraints);
		
		checkout_item_button = new JButton("Checkout Selected Item");
		checkout_item_button.addActionListener(this);
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 1;
		add(checkout_item_button, layoutConstraints);
		
		check_in_item_button = new JButton("Check-In Selected Item");
		check_in_item_button.addActionListener(this);
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 1;
		add(check_in_item_button, layoutConstraints);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object object = arg0.getSource();
		
		if (object == checkout_item_button) {
			caController.checkoutItem(itemTable.getSelectedRow());
		}
		if (object == check_in_item_button) {
			caController.checkinItem(itemTable.getSelectedRow());
		}
		
	}

}
