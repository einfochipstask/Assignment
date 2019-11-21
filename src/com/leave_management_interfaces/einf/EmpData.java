package com.leave_management_interfaces.einf;
import java.util.ArrayList;
import com.leave_management_portal2.einf.LeaveManagementPortal;
import com.leave_management_portal2.einf.LeaveStatus;

public interface EmpData {
	public ArrayList<LeaveManagementPortal> employeData(LeaveManagementPortal lmp);
	public ArrayList<LeaveManagementPortal> employeReturn();
	public ArrayList<LeaveStatus> leavePageData();
}
