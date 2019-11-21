package com.leave_management_portal2.einf;


import java.util.ArrayList;
import java.util.Scanner;


//import java.util.TreeSet;
public class EmployeeRegistration extends RegEmployeData {
	ArrayList<LeaveManagementPortal> ar;
	Scanner scanner = new Scanner(System.in);
	String ra;

	public void registration() {
		try {
			/*
			 * usingg scanner to assign vales to the variables
			 * id,name,address,design,ra,password
			 */
			System.out.println("Enter Employee Id : ");
			int id = scanner.nextInt();
			System.out.println("Enter Employee Name : ");
			String name = scanner.next();

			System.out.println("Enter Designation : ");
			String desig = scanner.next();
			if (desig != "manager") {
				System.out.println("Enter RA : ");
				String ra = scanner.next();
			} else {
				String ra = "N/A";
			}
			int leaves = 10;
			System.out.println("Enter password : ");
			String password = scanner.next();

			/* using tree set to store employee details */
			ar = employeData(new LeaveManagementPortal(id, name, ra, desig, leaves, password));
			 System.out.println(ar);

		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			Home h = new Home();
			h.homeLmp();

			scanner.close();

		}
	}
}
