package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controller.*;
import model.CUMember;

public class ResidentTab extends JPanel implements ActionListener {
	private ResidentController resident_controller;
	private GridBagConstraints layoutConstraints;
	
	private ResidentInformationPanel resident_info;
	private JButton temp_key_button;
	private JButton item_checkout_button;
	private JButton review_RCF_button;
	private JButton review_roommate_agreement_button;
	private JButton room_move_button;
	
	
	public ResidentTab(CUMember user) {
		resident_info = new ResidentInformationPanel(user);
		
		setLayout(new GridBagLayout());
		buildGUI();
	}
	
	private void buildGUI() {
		layoutConstraints = new GridBagConstraints();
		
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		add(resident_info, layoutConstraints);
		
		temp_key_button = new JButton("Request Temporary Key");
		temp_key_button.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridheight = 1;
		add(temp_key_button, layoutConstraints);
		
		item_checkout_button = new JButton("Item Check Out");
		item_checkout_button.addActionListener(this);
		layoutConstraints.gridy = 2;
		add(item_checkout_button, layoutConstraints);
		
		review_RCF_button = new JButton("Review Room Condition Form");
		review_RCF_button.addActionListener(this);
		layoutConstraints.gridy = 3;
		add(review_RCF_button, layoutConstraints);
		
		review_roommate_agreement_button = new JButton("Review Roommate Agreement");
		review_roommate_agreement_button.addActionListener(this);
		layoutConstraints.gridy = 4;
		add(review_roommate_agreement_button, layoutConstraints);
		
		room_move_button = new JButton("Apply For Room Move");
		room_move_button.addActionListener(this);
		layoutConstraints.gridy = 5;
		add(room_move_button, layoutConstraints);
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("hello world!");
	}
	

}
