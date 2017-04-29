package view;
import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CheckOutGUI extends JFrame implements ActionListener {
	
	private GridBagConstraints layoutConstraints;

	private Integer HEIGHT = 300;
	private Integer WIDTH = 400;
	private JLabel headerLabel;
	private JLabel dropDownLabel;
	private JButton submitButton;
	
	public CheckOutGUI() {
		setTitle("Check Out a Resident");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		buildCheckInGUI();
	}
	
	private void buildCheckInGUI() {
		layoutConstraints = new GridBagConstraints();
		
		headerLabel = new JLabel("New Resident Check Out Form:", JLabel.CENTER);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 2;
		add(headerLabel, layoutConstraints);
		
		dropDownLabel = new JLabel("Choose Resident:  ");
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 1;
		add(dropDownLabel, layoutConstraints);
		
		String[] choices = { "Tom Smith","Dick Henry", "Harry Nutz"};
		final JComboBox<String> residents = new JComboBox<String>(choices);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 1;
		layoutConstraints.gridwidth = 2;
		add(residents, layoutConstraints);
		
		submitButton = new JButton("Check Resident Out");
		//submitButton.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridx = 1;
		layoutConstraints.gridy = 3;
		add(submitButton, layoutConstraints);
		
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object object = ae.getSource();

		if (object == submitButton) {
			System.out.println("Submit Button Pressed");
			dispose();
		}
	}
}
