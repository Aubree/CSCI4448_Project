package controller;
import java.sql.*;
import javax.swing.*;
import java.util.Date;
import model.*;
import view.*;

public class LogInController {
	private CUMember user;
	
	
	public CUMember logInUser(String username, String password) {
		
		System.out.print(username);
		System.out.print(password);
		user = CUMember.lookUpUser(username, password);
		
		return user;
		
		/*
		if(!CUMember.isValidUser(username, password)) {
			// Should give an error message
			String errorMsg = "Error: invalid username or password.";
			JOptionPane.showMessageDialog(new JFrame(), errorMsg);
			return ReturnCode.VALIDATION_ERROR;
		}
		
		// Will need to be adjusted to take in the username
		// Using default user for iniitial development
		user = new CUMember();
		
		return ReturnCode.OPERATION_SUCCESSFUL;
		*/
	}
	
	public CUMember getUser() {
		return user;
	}
}
