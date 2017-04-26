package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.CUMember;
import model.CommunityAssistant;

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
	
}
