package com.leave_management_portal2.einf;

import java.util.ArrayList;

public class RegEmployeData {

	// LeaveManagementPortal lmp = new
	// LeaveManagementPortal(1,"avinash","dimple","trainee",10,"gudimalla");
	ArrayList<LeaveManagementPortal> al = new ArrayList<LeaveManagementPortal>();
	ArrayList<LeaveStatus> a = new ArrayList<LeaveStatus>();

	public ArrayList<LeaveManagementPortal> employeData(LeaveManagementPortal lmp) {
		
		if(lmp != null) {
			al.add(lmp);
		}
		
		al.add(new LeaveManagementPortal(1, "avinash", "dimple", "trainee", 10, "gudimalla"));
		al.add(new LeaveManagementPortal(2, "satya", "dimple", "trainee", 10, "6895"));
		al.add(new LeaveManagementPortal(3, "raj", "ramu", "trainee", 10, "1258"));
		al.add(new LeaveManagementPortal(4, "ganeeth", "ramya", "trainee", 10, "3443"));
		al.add(new LeaveManagementPortal(5, "sri", "sushma", "trainee", 10, "9102"));
		al.add(new LeaveManagementPortal(6, "venu", "saurab", "trainee", 10, "5678"));
		al.add(new LeaveManagementPortal(7, "mounik", "N/A", "manager", 10, "1234"));
		al.add(new LeaveManagementPortal(7, "admin", "N/A", "manager", 10, "1234"));
		return al;

	}
	


	//creating method of ArrayList of type LeaveStatus and returning  ArrayList of type LeaveStatus
	public ArrayList<LeaveStatus> leavePageData() {

		a.add(new LeaveStatus(1, "pending"));
		a.add(new LeaveStatus(1, "pending"));
		a.add(new LeaveStatus(2, "pending"));
		a.add(new LeaveStatus(2, "pending"));
		a.add(new LeaveStatus(3, "pending"));
		a.add(new LeaveStatus(3, "pending"));
		return a;

	}

}
