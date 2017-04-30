package view;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

import model.Building;
import model.CUMember;
import model.ResidentProfile;
import model.Room;

public class CheckInGUI extends JFrame implements ActionListener {
	
	private GridBagConstraints layoutConstraints;

	private Integer HEIGHT = 600;
	private Integer WIDTH = 400;
	private JLabel headerLabel;
	private JLabel firstNameLabel;
	private JTextField firstNameTextField;
	private JLabel lastNameLabel;
	private JTextField lastNameTextField;
	private JLabel passwordLabel;
	private JTextField passwordTextField;
	private JLabel userNameLabel;
	private JTextField userNameTextField;
	private JLabel genderLabel;
	private JTextField genderTextField;
	private JLabel phoneNumberLabel;
	private JTextField phoneNumberTextField;
	private JLabel buildingLabel;
	private JTextField buildingTextField;
	private JLabel studentRoomLabel;
	private JTextField studentRoomTextField;
	private JButton submitButton;
	
	public CheckInGUI() {
		setTitle("Create New Resident");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		buildCheckInGUI();
	}
	
	private void buildCheckInGUI() {
		layoutConstraints = new GridBagConstraints();
		
		headerLabel = new JLabel("New Resident Creation Form", JLabel.CENTER);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 2;
		add(headerLabel, layoutConstraints);
		
		firstNameLabel = new JLabel("First Name:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 1;
		add(firstNameLabel, layoutConstraints);
		
		firstNameTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 1;
		add(firstNameTextField, layoutConstraints);
		
		lastNameLabel = new JLabel("Last Name:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 2;
		layoutConstraints.gridwidth = 1;
		add(lastNameLabel, layoutConstraints);
		
		lastNameTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 2;
		add(lastNameTextField, layoutConstraints);
		
		genderLabel = new JLabel("Gender:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 3;
		layoutConstraints.gridwidth = 1;
		add(genderLabel, layoutConstraints);
		
		genderTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 3;
		add(genderTextField, layoutConstraints);
		
		phoneNumberLabel = new JLabel("Phone Number:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 4;
		layoutConstraints.gridwidth = 1;
		add(phoneNumberLabel, layoutConstraints);
		
		phoneNumberTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 4;
		add(phoneNumberTextField, layoutConstraints);
		
		buildingLabel = new JLabel("Building:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 5;
		layoutConstraints.gridwidth = 1;
		add(buildingLabel, layoutConstraints);
		
		buildingTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 5;
		add(buildingTextField, layoutConstraints);
		
		/*
		 * studentRoomLabel = new JLabel("StudentRoom:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 6;
		layoutConstraints.gridwidth = 1;
		add(studentRoomLabel, layoutConstraints);
		
		studentRoomTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 6;
		add(studentRoomTextField, layoutConstraints);
		*/
		
		passwordLabel = new JLabel("New Password:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 7;
		layoutConstraints.gridwidth = 1;
		add(passwordLabel, layoutConstraints);
		
		passwordTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 7;
		add(passwordTextField, layoutConstraints);
		
		userNameLabel = new JLabel("New Username:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 8;
		layoutConstraints.gridwidth = 1;
		add(userNameLabel, layoutConstraints);
		
		userNameTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 8;
		add(userNameTextField, layoutConstraints);
		
		submitButton = new JButton("Create Resident");
		submitButton.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 9;
		add(submitButton, layoutConstraints);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent a) {
		
		Building building = Building.lookUp(buildingTextField.getText());
		//Room room = Room.lookUp(studentRoomTextField.getText());
		
		CUMember newbie = new CUMember(passwordTextField.getText(), userNameTextField.getText(), firstNameTextField.getText(), lastNameTextField.getText(), genderTextField.getText(), phoneNumberTextField.getText());
		CUMember.addUser(newbie);
		ResidentProfile hey = new ResidentProfile(newbie, building, building.placeResident(newbie));
		newbie.setResident_profile(hey);
		
	}

}

	

