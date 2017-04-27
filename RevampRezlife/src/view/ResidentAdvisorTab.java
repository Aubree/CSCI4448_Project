package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import model.CUMember;
import model.ResidentAdvisor;

import controller.ResidentAdvisorController;

public class ResidentAdvisorTab extends JPanel implements ActionListener{
	private ResidentAdvisorController resident_advisor_controller;
	private GridBagConstraints layoutConstraints;
	
	private JScrollPane table_scroll_pane;
	private JTable resident_table;
	private DefaultTableModel table_model;
	private JButton email_button;
	private JButton check_in_button;
	private JButton check_out_button;
	private JButton manage_121_button;
	private JButton manage_rcf_button;
	private JButton manage_roommate_agreement_button;
	
	public ResidentAdvisorTab(ResidentAdvisor user) {
		resident_advisor_controller = new ResidentAdvisorController(user);
		layoutConstraints = new GridBagConstraints();
		
		setLayout(new GridBagLayout());
		buildGUI();
	}

	private void buildGUI() {
		
		
		//buildTable();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		email_button = new JButton("Email Residents");
		email_button.addActionListener(this);
		add(email_button, layoutConstraints);
		
		layoutConstraints.gridy = 1;
		check_in_button = new JButton("Check In Resident");
		check_in_button.addActionListener(this);
		add(check_in_button, layoutConstraints);
		
		layoutConstraints.gridy = 2;
		check_out_button = new JButton("Check Out Button");
		check_out_button.addActionListener(this);
		add(check_out_button, layoutConstraints);
		
		layoutConstraints.gridy = 3;
		manage_121_button = new JButton("Manage 121's");
		manage_121_button.addActionListener(this);
		add(manage_121_button, layoutConstraints);
		
		layoutConstraints.gridy = 4;
		manage_rcf_button = new JButton("Manage RCF's");
		manage_rcf_button.addActionListener(this);
		add(manage_rcf_button, layoutConstraints);
		
		layoutConstraints.gridy = 5;
		manage_roommate_agreement_button = new JButton("Manage Roommate Agreements");
		manage_roommate_agreement_button.addActionListener(this);
		add(manage_roommate_agreement_button, layoutConstraints);
		
		
		
		/*layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		add(table_scroll_pane, layoutConstraints);*/
		
	
	}
	
	private void buildTable() {
		
		//table_model = new DefaultTableModel();
		String header[] = new String[] {"Resident Name","Room Number", "RCF Complete", "Roommate Agreement Complete"};
		String data[][] = {{"George Washington", "555", "Yes", "No"}, 
				{"George Washington", "555", "Yes", "No"}, 
				{"George Washington", "555", "Yes", "No"}};
		//table_model.setColumnIdentifiers(header);
		
		resident_table = new JTable(data, header) {
			public boolean isCellEditable(int data, int columns) {
				return false;
			}
		};
		//resident_table.setModel(table_model);

		resident_table.setPreferredScrollableViewportSize(new Dimension(500,50));
		resident_table.setFillsViewportHeight(true);
		
		table_scroll_pane = new JScrollPane(resident_table);
		
		add(table_scroll_pane);
		
	}

	public void actionPerformed(ActionEvent ae) {
		Object object = ae.getSource();
		if (object == email_button) {
			
			System.out.println("Email Button Pressed");
		}
		if (object == check_in_button) {
			CheckInGUI checkIn = new CheckInGUI();
			System.out.println("Check In Button Pressed");
		}
		if (object == check_out_button) {
			System.out.println("Check Out Button Pressed");
		}
		if (object == manage_121_button) {
			System.out.println("Manage 121 Button Pressed");
		}
		if (object == manage_rcf_button) {
			System.out.println("Manage RCF Button Pressd");
		}
		if (object == manage_roommate_agreement_button) {
			System.out.println("Manage Roommate Agreement Button Pressed");
		}
	}

}
