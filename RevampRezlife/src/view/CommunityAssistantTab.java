package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controller.CommunityAssistantController;

import model.CUMember;
import model.CommunityAssistant;

public class CommunityAssistantTab extends JPanel implements ActionListener{
	private CommunityAssistantController ca_controller;
	private GridBagConstraints layoutConstraints;
	
	private JButton item_manager_button;
	private JButton make_temporary_key_button;
	private JButton return_temporary_key_button;
	private JButton room_move_button;
	
	public CommunityAssistantTab(CommunityAssistant user) {
		ca_controller = new CommunityAssistantController(user);
		
		setLayout(new GridBagLayout());
		buildGUI();
	}
	
	private void buildGUI() {
		layoutConstraints = new GridBagConstraints();
		
		item_manager_button = new JButton("Item Check-out/Check-in");
		item_manager_button.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		add(item_manager_button, layoutConstraints);
		
		make_temporary_key_button = new JButton("Make Temporary Key");
		make_temporary_key_button.addActionListener(this);
		layoutConstraints.gridy = 1;
		add(make_temporary_key_button, layoutConstraints);
		
		return_temporary_key_button = new JButton("Return Temporary Key");
		return_temporary_key_button.addActionListener(this);
		layoutConstraints.gridy = 2;
		add(return_temporary_key_button, layoutConstraints);
		
		room_move_button = new JButton("Room Move");
		room_move_button.addActionListener(this);
		layoutConstraints.gridy = 3;
		add(room_move_button, layoutConstraints);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object object = ae.getSource();
		if (object == item_manager_button) {
			System.out.println("Item Manager Button Pushed");
		}
		if (object == make_temporary_key_button) {
			System.out.println("Make Temporary Key Button Pushed");
		}
		if (object == return_temporary_key_button) {
			System.out.println("Return Temporary Key Button Pushed");
		}
		if (object == room_move_button) {
			System.out.println("Room Move Button Pushed");
		}
	}
}
