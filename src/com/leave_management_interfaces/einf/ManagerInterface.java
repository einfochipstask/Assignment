package com.leave_management_interfaces.einf;

import java.util.ArrayList;

import com.leave_management_portal2.einf.LeaveManagementPortal;
import com.leave_management_portal2.einf.LeaveStatus;

public interface ManagerInterface {
	
	public void leaveViewPage (ArrayList<LeaveStatus> a);
	public void manager(ArrayList<LeaveManagementPortal> arr);
}
