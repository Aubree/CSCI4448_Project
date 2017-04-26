package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.CommunityAssistantController;


public class CommunityAssistantMakeTempKeyGUI extends JFrame implements ActionListener {
	private CommunityAssistantController caController;
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public CommunityAssistantMakeTempKeyGUI(CommunityAssistantController ca_controller) {
		caController = ca_controller;
		setTitle("Make Temp Key");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		buildGUI();
	}

	private void buildGUI() {
		
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
