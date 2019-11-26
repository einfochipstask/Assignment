package com.leave_management_portal2.einf;


import java.util.ArrayList;
import java.util.Scanner;


//import java.util.TreeSet;
public class EmployeeRegistration extends RegEmployeData {
	
	//creating arraylist of LeaveManagementPortal type
	
	ArrayList<LeaveManagementPortal> ar;
	
	Scanner scanner = new Scanner(System.in);
	
	//creating variable ra
	
	String ra;

	public void registration() {
		try {
			/*
			 * using scanner to assign vales to the variables
			 * id,name,address,design,ra,password
			 */
			System.out.println("Enter Employee Id : ");
			
			int id = scanner.nextInt();
			
			System.out.println("Enter Employee Name : ");
			
			String name = scanner.next();

			System.out.println("Enter Designation : ");
			
			String desig = scanner.next();
			
			//if designation is manager then no need of ra
			
			if (desig != "manager") {
				
				System.out.println("Enter RA : ");
				
				String ra = scanner.next();
				
			} else {
				
				String ra = "N/A";
			}
			
			//creating variable leaves with default total number of leaves =10
			
			int leaves = 10;
			
			System.out.println("Enter password : ");
			
			String password = scanner.next();

			/* using array list to store employee details */
			
			ar = employeData(new LeaveManagementPortal(id, name, ra, desig, leaves, password));
			
			//displaying array list
			
			System.out.println(ar);

		}

		catch (Exception e) {
			System.out.println(e);
		}

		finally {
			
			// navigating back to home page
			
			Home h = new Home();
			
			h.homeLmp();

			scanner.close();

		}
	}
}
