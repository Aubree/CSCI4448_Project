package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;



public class LogInGUI {
	private LogInController loginController;
	private JFrame mainFrame;
	private GridBagConstraints layoutConstraints;
	private JLabel headerLabel;
	private JLabel identikeyLabel;
	private JLabel passwordLabel;
	private JTextField identikeyTextField;
	private JPasswordField passwordField;
	private JButton submitButton;
	
	private Integer HEIGHT = 100;
	private Integer WIDTH = 250;
	
	public LogInGUI() {
		loginController = new LogInController();
		buildGUI();
	
	}
	
	private void buildGUI() {
		mainFrame = new JFrame("Revamp Rezlife Log-In");
		mainFrame.setSize(WIDTH, HEIGHT);
		mainFrame.setLayout(new GridBagLayout());
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		layoutConstraints = new GridBagConstraints();
		
		headerLabel = new JLabel("Revamp Rezlife Log-In", JLabel.CENTER);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 2;
		mainFrame.add(headerLabel, layoutConstraints);
		
		identikeyLabel = new JLabel("identikey:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 1;
		mainFrame.add(identikeyLabel, layoutConstraints);
		
		identikeyTextField = new JTextField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 1;
		mainFrame.add(identikeyTextField, layoutConstraints);
		
		passwordLabel = new JLabel("password:");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 2;
		mainFrame.add(passwordLabel, layoutConstraints);
		
		passwordField = new JPasswordField();
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 2;
		mainFrame.add(passwordField, layoutConstraints);
		
		submitButton = new JButton("Sign In");
		submitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnCode result;
				result = loginController.logInUser(identikeyTextField.getText(), passwordField.getText());
				if (result.equals(ReturnCode.VALIDATION_ERROR)) {
					identikeyTextField.setText("");
					passwordField.setText("");
				}
				if (result.equals(ReturnCode.OPERATION_SUCCESSFUL)) {
					mainFrame.dispose();
				}
			}
		});
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 3;
		mainFrame.add(submitButton, layoutConstraints);
		
		mainFrame.setVisible(true);
	
	}
}
