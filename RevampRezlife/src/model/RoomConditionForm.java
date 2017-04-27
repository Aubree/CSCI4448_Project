package model;

import java.util.ArrayList;
public class RoomConditionForm {
	private Boolean complete;
	private ArrayList<RoomAttribute> roomAttributeList;
	private Integer CU_Id;
	
	
	public RoomConditionForm(ArrayList<RoomAttribute> _roomAttributes, Integer _CU_Id) {
		roomAttributeList = new ArrayList<RoomAttribute>();
		for(int i = 0; i < _roomAttributes.size(); i++){
			roomAttributeList.add(new RoomAttribute(_roomAttributes.get(i)));
		}
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
	
	public Boolean isFinalized(RoomConditionForm rcf){
		return complete; 
	}
	
	public ArrayList<RoomAttribute> getRoomAttributes(){
		return roomAttributeList;
	}
	
	public String getCondition(Integer attributeId){
		for(int i = 0; i < roomAttributeList.size(); i++){
			if(roomAttributeList.get(i).getAttributeId() == attributeId){
				if(roomAttributeList.get(i).getStatus() == RoomAttributeState.GOOD){
					return "Good";
				}
				else if (roomAttributeList.get(i).getStatus() == RoomAttributeState.DAMAGED){
					return "Damaged";
				}
				else if (roomAttributeList.get(i).getStatus() == RoomAttributeState.MISSING){
					return "Missing";
				}
				else if (roomAttributeList.get(i).getStatus() == RoomAttributeState.POOR){
					return "Poor";
				}
				
			}
			
		}
		return "";
	}
	
	public void setComment(String _comment,Integer attributeId){
		for(int i = 0; i < roomAttributeList.size(); i++){
			if(roomAttributeList.get(i).getAttributeId() == attributeId){
				roomAttributeList.get(i).setComment(_comment);
			}
		}
	}
	
	public void setState(String _state,Integer attributeId){
		for(int i = 0; i < roomAttributeList.size(); i++){
			if(roomAttributeList.get(i).getAttributeId() == attributeId){
				if(_state.equals("GOOD")){
					roomAttributeList.get(i).setStatus(RoomAttributeState.GOOD);
				}
				else if (_state.equals("DAMAGED")){
					roomAttributeList.get(i).setStatus(RoomAttributeState.DAMAGED);
				}
				else if (_state.equals("MISSING")){
					roomAttributeList.get(i).setStatus(RoomAttributeState.MISSING);
				}
				else if (_state.equals("POOR")){
					roomAttributeList.get(i).setStatus(RoomAttributeState.POOR);
				}
			}
		}
	}
	
	
}
