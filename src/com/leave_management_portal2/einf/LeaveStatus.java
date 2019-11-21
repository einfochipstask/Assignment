package com.leave_management_portal2.einf;
//creating  LeaveStatus class
public class LeaveStatus {
//declaring private variables of LeaveStatus	
	private int id ;
	private String status ;
	//creating constructor 
	public LeaveStatus(int id, String status) {
		
		this.id = id;
		this.status = status;
	}
	//creating setters and getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//overriding tostring()
	@Override
	public String toString() {
		return "LeaveStatus \n id=" + id + ", \n status=" + status ;
	}
	

}
