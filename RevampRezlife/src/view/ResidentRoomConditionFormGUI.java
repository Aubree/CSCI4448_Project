package view;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import controller.ResidentController;

import model.ResidentProfile;

public class ResidentRoomConditionFormGUI extends JFrame implements ActionListener {
	private ResidentController residentController;
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public ResidentRoomConditionFormGUI(ResidentController resident_controller) {
		residentController = resident_controller;
		setTitle("Review Room Condition Form");
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
