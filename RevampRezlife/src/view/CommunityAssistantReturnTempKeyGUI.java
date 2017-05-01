package view;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controller.CommunityAssistantController;
import controller.ReturnCode;

import model.Key;


public class CommunityAssistantReturnTempKeyGUI extends JFrame implements ActionListener {
	private CommunityAssistantController caController;
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	private GridBagConstraints layoutConstraints;
	
	private JButton make_temporary_key_button;
	private JButton test_button;
	private JLabel studentIdLabel;
	private JLabel tempKeyNumLabel;
	private JTextField studentIdTextField;
	private JTextField tempKeyNumTextField;
	
	private String studentId;
	private String tempKeyNum;
	private Key key;
	
	public CommunityAssistantReturnTempKeyGUI(CommunityAssistantController ca_controller) {
		caController = ca_controller;
		setTitle("Make Temp Key");
		setSize(WIDTH, HEIGHT);
		setLayout(new GridBagLayout());
		buildGUI();
	}

	private void buildGUI() {
		
		layoutConstraints = new GridBagConstraints();
		
		studentIdLabel = new JLabel("               Student ID:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		add(studentIdLabel, layoutConstraints);
		
		studentIdTextField = new JTextField(10);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 0;
		add(studentIdTextField, layoutConstraints);
		
		tempKeyNumLabel = new JLabel("Temp Key Number:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 1;
		add(tempKeyNumLabel, layoutConstraints);
		
		tempKeyNumTextField = new JTextField(10);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 1;
		add(tempKeyNumTextField, layoutConstraints);
		
		make_temporary_key_button = new JButton("Return Temp");
		make_temporary_key_button.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 2;
		layoutConstraints.gridwidth = 1;
		add(make_temporary_key_button, layoutConstraints);
		
		this.setVisible(true);
	}
	private void tempKeyResponse(int choice) {
		if (choice == JOptionPane.YES_OPTION) {
			boolean result = true;
			//boolean result = key.modifyKey(studentId, tempKeyNum);
			if (result == true) {
				JOptionPane.showMessageDialog(null, "Returned Temporary Key.");
			}
			else {
				choice = JOptionPane.showConfirmDialog(null, "Failed to Return temporary key. Retry?");
				if (choice == JOptionPane.YES_OPTION) {
					tempKeyResponse(choice);
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object object = arg0.getSource();
		if (object == make_temporary_key_button) {
			int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to return a Temporary Key?");
			tempKeyResponse(choice);
		}
		
		ReturnCode result;
		result = caController.validateId(studentIdTextField.getText(), tempKeyNumTextField.getText());
		if (result.equals(ReturnCode.VALIDATION_ERROR)) {
			studentIdTextField.setText("");
			tempKeyNumTextField.setText("");
		}
		if (result.equals(ReturnCode.OPERATION_SUCCESSFUL)) {
			new HomeGUI(caController.getUser());
			dispose();
		}
		// TODO Auto-generated method stub
		
	}

}