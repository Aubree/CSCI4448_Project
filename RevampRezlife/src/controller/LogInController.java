package controller;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
import model.*;
import view.*;

public class LogInController {
	private HomeGUI homeGUI;
	
	public ReturnCode logInUser(String username, String password) {
		// Todo: Implement database connection and confirm identity
		if(!CUMember.isValidUser(username, password)) {
			// Should give an error message
			String errorMsg = "Error: invalid username or password.";
			JOptionPane.showMessageDialog(new JFrame(), errorMsg);
			return ReturnCode.VALIDATION_ERROR;
		}
		
		CUMember user = new CUMember(username, password);
		homeGUI = new HomeGUI(user);
		
		return ReturnCode.OPERATION_SUCCESSFUL;
	}
}