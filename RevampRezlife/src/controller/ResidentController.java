package controller;

import java.util.ArrayList;
import java.util.Collection;

import model.CUMember;
import model.DeskItem;
import model.FrontDesk;
import model.RoomConditionForm;

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
	
	public Collection<DeskItem> viewDeskItems() {
		ArrayList<FrontDesk> front_desks = user.getResident_profile().getBuilding().getFrontDesks();
		ArrayList<DeskItem> desk_items = new ArrayList<DeskItem>();
		for (int i = 0; i < front_desks.size(); i++) {
			FrontDesk desk = front_desks.get(i);
			for (int j = 0; j < desk.getDeskItems().size(); j++) {
				desk_items.add(desk.getDeskItem(j));
			}
		}
		return desk_items;
	}
	
	public void submitRCF(RoomConditionForm rcf) {
		rcf.finalize();
	}
}
