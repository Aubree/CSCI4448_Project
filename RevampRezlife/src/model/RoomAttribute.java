package model;

public class RoomAttribute {
	private String name;
	private Integer attribute_id;
	private RoomAttributeState status;
	private String description;
	private String comment;
	
	public RoomAttribute(String _name){
		this.name = _name;
		status = RoomAttributeState.GOOD;
		description = "description";
		comment = "comment";
	}
	public RoomAttributeState getStatus(){
		return status;
	}
	
	public void setStatus(RoomAttributeState _status){
		this.status = _status;
	}
	
	public String getDescription(){
		return description;
	}
	
	public String getComment(){
		return comment;
	}
	
	public String getName(){
		return name;
	}
	
	public void setComment(String _comment){
		this.comment = _comment;
	}
	
	public Integer getAttributeId(){
		return attribute_id;
	}
}
