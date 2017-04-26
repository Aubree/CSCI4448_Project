package model;

import java.util.ArrayList;
public class RoomConditionForm {
	private Boolean complete;
	private ArrayList<RoomAttribute> roomAttributeList;
	private Integer CU_Id;
	
	
	public RoomConditionForm(ArrayList<RoomAttribute> _roomAttributes, Integer _CU_Id) {
		this.roomAttributeList = _roomAttributes;
		complete = false;
		this.CU_Id = _CU_Id;
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
	
	public Integer getCU_Id(){
		return CU_Id;
	}
	public void finalize(){
		complete = true;
	}
	
	public ArrayList<RoomAttribute> getRoomAttributes(){
		return roomAttributeList;
	}
}
