package controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.CUMember;
import model.CommunityAssistant;
import model.DeskItem;
import model.FrontDesk;
import model.ItemState;

public class CommunityAssistantController {
	private CommunityAssistant user;
	private CUMember resident;
	private ArrayList<DeskItem> deskItemsList;
	
	
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
		deskItemsList = new ArrayList<DeskItem>();
		for (int i = 0; i < front_desks.size(); i++) {
			FrontDesk desk = front_desks.get(i);
			for (int j = 0; j < desk.getDeskItems().size(); j++) {
				deskItemsList.add(desk.getDeskItem(j));
			}
		}
		return deskItemsList;
	}
	
	public String getDeskItemState(Integer item_id) {
		return deskItemsList.get(item_id).getItemState().toString();
	}
	
	public void checkoutItem(Integer item_id) {
		if (deskItemsList.get(item_id).isAvailableForCheckout()) {
			deskItemsList.get(item_id).checkoutItem();
		}
	}
	
	public void checkinItem(Integer item_id) {
		deskItemsList.get(item_id).checkInItem();
	}
	
}
