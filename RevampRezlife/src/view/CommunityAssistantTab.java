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
	private CommunityAssistantController caController;
	private GridBagConstraints layoutConstraints;
	
	private JButton itemManagerButton;
	private JButton makeTemporaryKeyButton;
	private JButton returnTemporaryKeyButton;
	private JButton roomMoveButton;
	
	public CommunityAssistantTab(CommunityAssistant user) {
		caController = new CommunityAssistantController(user);
		setLayout(new GridBagLayout());
		buildGUI();
	}
	
	private void buildGUI() {
		layoutConstraints = new GridBagConstraints();
		
		itemManagerButton = new JButton("Item Check-out/Check-in");
		itemManagerButton.addActionListener(this);
		layoutConstraints.fill = layoutConstraints.HORIZONTAL;
		layoutConstraints.gridx = 0;
		layoutConstraints.gridy = 0;
		layoutConstraints.gridwidth = 1;
		layoutConstraints.gridheight = 1;
		add(itemManagerButton, layoutConstraints);
		
		makeTemporaryKeyButton = new JButton("Make Temporary Key");
		makeTemporaryKeyButton.addActionListener(this);
		layoutConstraints.gridy = 1;
		add(makeTemporaryKeyButton, layoutConstraints);
		
		returnTemporaryKeyButton = new JButton("Return Temporary Key");
		returnTemporaryKeyButton.addActionListener(this);
		layoutConstraints.gridy = 2;
		add(returnTemporaryKeyButton, layoutConstraints);
		
		roomMoveButton = new JButton("Room Move");
		roomMoveButton.addActionListener(this);
		layoutConstraints.gridy = 3;
		add(roomMoveButton, layoutConstraints);		
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		Object object = ae.getSource();
		if (object == itemManagerButton) {
			new CommunityAssistantItemManagementGUI(caController);
			System.out.println("Item Manager Button Pushed");
		}
		if (object == makeTemporaryKeyButton) {
			new CommunityAssistantMakeTempKeyGUI(caController);
			System.out.println("Make Temporary Key Button Pushed");
		}
		if (object == returnTemporaryKeyButton) {
			new CommunityAssistantReturnTempKeyGUI(caController);
			System.out.println("Return Temporary Key Button Pushed");
		}
		if (object == roomMoveButton) {
			System.out.println("Room Move Button Pushed");
		}
	}
}
