package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import controller.*;

public class ResidentTab extends JPanel implements ActionListener {
	private ResidentController resident_controller;
	private GridBagConstraints layoutConstraints;
	
	private JButton temp_key_button;
	private JButton view_RCF;
	
	
	public ResidentTab() {
		setLayout(new GridBagLayout());
		buildGUI();
	}
	
	private void buildGUI() {
		layoutConstraints = new GridBagConstraints();
		
		temp_key_button = new JButton("Request Temporary Key");
		temp_key_button.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 2;
		add(temp_key_button, layoutConstraints);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		System.out.println("hello world!");
	}
	

}
