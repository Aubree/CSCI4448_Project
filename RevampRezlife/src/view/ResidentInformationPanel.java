package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.*;
import model.CUMember;
import model.ResidentProfile;

public class ResidentInformationPanel extends JPanel {
	private GridBagConstraints layoutConstraints;
	private JLabel first_name_label;
	private JLabel last_name_label;
	private JLabel student_id_label;
	private JLabel email_label;
	private JLabel phone_number_label;
	private JLabel room_label;
	
	
	
	public ResidentInformationPanel(CUMember user) {
		layoutConstraints = new GridBagConstraints();
		first_name_label = new JLabel("First Name: " + user.getFirstname());
		last_name_label = new JLabel("Last Name: " + user.getLastname());
		student_id_label = new JLabel("Student ID: " + user.getCu_id());
		email_label = new JLabel("Email: " + user.getEmail());
		phone_number_label = new JLabel("Phone Number: " + user.getPhone_number());
		room_label = new JLabel("Room: ");
		
		setLayout(new GridBagLayout());
		buildGUI();
		
	}
	
	private void buildGUI(){
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		add(first_name_label, layoutConstraints);
		
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		add(last_name_label, layoutConstraints);
		
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 2;
		add(student_id_label, layoutConstraints);
		
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 3;
		add(room_label, layoutConstraints);
		
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 4;
		add(email_label, layoutConstraints);
		
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 5;
		add(phone_number_label, layoutConstraints);
		
		setVisible(true);
	}

}
