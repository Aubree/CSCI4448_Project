package controller;

import model.CUMember;

public class ResidentController {
	private CUMember user;
	
	public ResidentController(CUMember user) {
		this.user = user;
	}
	
	public CUMember getUser() {
		return user;
	}
	
	public boolean requestTemporaryKey() {
		// Needs to send request to CA, if request sent and received correctly, return true, otherwise return false
		return false;
	}
}
