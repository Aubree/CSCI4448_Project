package view;

import java.awt.GridBagLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controller.ResidentController;
import model.CUMember;
import model.ResidentProfile;

public class ResidentItemCheckoutGUI extends JFrame implements ActionListener, ListSelectionListener {
	private ResidentProfile residentProfile;
	
	private JTable itemTable;
	
	private Integer HEIGHT = 500;
	private Integer WIDTH = 500;
	
	public ResidentItemCheckoutGUI(ResidentController resident_controller) {
		residentProfile = resident_controller.getUser().getResident_profile();
		setTitle("Item Checkout");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLayout(new GridBagLayout());
		buildGUI();
	}

	private void buildGUI() {
		
		setVisible(true);
	}
	
	private void buildItemTable() {
		
	}
	
	
	public void actionPerformed(ActionEvent arg0) {
		
	}

	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
