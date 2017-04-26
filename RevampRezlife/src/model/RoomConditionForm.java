package model;

import java.util.ArrayList;
public class RoomConditionForm {
	private Boolean complete;
	private ArrayList<RoomAttribute> roomAttributeList;
	private Integer CU_Id;
	private ArrayList<RoomAttribute> comments;
	
	public RoomConditionForm(ArrayList<RoomAttribute> _roomAttributes) {
		this.roomAttributeList = _roomAttributes;
		complete = false;
	}
	
	public ArrayList<RoomAttribute> updateRCF(Integer attributeId, RoomAttributeState state, String comment){
		if(complete = false){
		for(int i = 0; i < roomAttributeList.size(); i++){
			if (roomAttributeList.get(i).getAttributeId() == attributeId){
				roomAttributeList.get(i).setStatus(state);
				roomAttributeList.get(i).setComment(comment);
				return roomAttributeList; 
			}
		}
	}
		return null;
	}
	
	public void finalize(){
		complete = true;
	}
}
