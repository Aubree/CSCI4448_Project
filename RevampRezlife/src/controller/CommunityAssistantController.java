package controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.CUMember;
import model.CommunityAssistant;
import model.DeskItem;
import model.FrontDesk;

public class CommunityAssistantController {
	private CommunityAssistant user;
	private CUMember resident;
	
	
	public CommunityAssistantController(CommunityAssistant ca) {
		user = ca;
	}
	public boolean makeTemporaryKey(String studentId, String tempKeyNum) {
		
		//Figure this shit out
		return false;
	}
	public ReturnCode validateId(String studentId , String tempKeyNum) {
		// Todo: Implement database connection and confirm identity
		if(!CUMember.isValidUser(studentId, tempKeyNum)) {
			// Should give an error message
			String errorMsg = "Error: invalid username or password.";
			JOptionPane.showMessageDialog(new JFrame(), errorMsg);
			return ReturnCode.VALIDATION_ERROR;
		}
		resident = new CUMember();

		
		return ReturnCode.OPERATION_SUCCESSFUL;
	}
	public CUMember getUser() {
		return resident;
	}
	
	public Collection<DeskItem> viewDeskItems() {
		ArrayList<FrontDesk> front_desks = user.getBuildingWorked().getFrontDesks();
		ArrayList<DeskItem> desk_items = new ArrayList<DeskItem>();
		for (int i = 0; i < front_desks.size(); i++) {
			FrontDesk desk = front_desks.get(i);
			for (int j = 0; j < desk.getDeskItems().size(); j++) {
				desk_items.add(desk.getDeskItem(j));
			}
		}
		return desk_items;
	}
	
}
