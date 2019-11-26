package com.leave_management_portal2.einf;

import java.util.ArrayList;
import java.util.Scanner;

import com.leave_management_interfaces.einf.EmployeeInterfaces;

public class EmployeBlog extends RegEmployeData implements EmployeeInterfaces {
	
	Scanner scanner = new Scanner(System.in);
	
	// creating object of RegEmployeData class
	
	RegEmployeData r = new RegEmployeData(); 
	
	// assigning arraylist return type from employeeReturn() to an Arrylist of
	// Leavemanagementportal data type
	
	ArrayList<LeaveManagementPortal> al2=r.employeData(null);

	//overriding employee method of EmployeeInterfaces interface
	
	@Override
	public void employee(ArrayList<LeaveManagementPortal> ar2) {
		
		ArrayList<LeaveManagementPortal> ar=ar2;
		System.out.println("**************** Welcom To Leave Management portal Employee blog Page *****************");
		System.out.println();
		System.out.println("Select any option below : ");
		System.out.println("1.Take Leave");
		System.out.println("2.Show Leave");
		System.out.println("3.Show Employee");
		System.out.println("***************************************************************************************");
		
		// using scanner to collect option
		
		int opt = scanner.nextInt();
		
		// exceptional handling
		
		try 
		{
			// passing opt to switch case
			
			switch (opt) {
			
			case 1:
				//calling takeLeaves method
				
				takeLeaves(ar);
				
				System.out.println("***************************************************************************************");
				
				break;
			case 2:
				
				//calling showLeave method
				
				showLeaves(ar);
				
				System.out.println("***************************************************************************************");
				
				break;
			case 3:
				//calling showEmployee method
				
				showEmployees(al2);
				
				System.out.println("***************************************************************************************");

				break;
			default:

				System.out.println("Enter a valied option :");

				break;

			}
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			
			System.out.println("***************************************************************************************");
			
			//calling doYouWantToContinue method
			
			doYouWantToContinue(ar2);
			

		}

	}

	
	//overriding takeLeaves method of EmployeeInterfaces interface
	
	@Override
	public void takeLeaves(ArrayList<LeaveManagementPortal> al) {
		
		// exception handling
		
		try { 
			System.out.println("Enter Id");
			
			int ide = scanner.nextInt();
			
			System.out.println("Enter Number of Leaves You Want");
			
			int lev = scanner.nextInt();
			
			// using for loop to iterate among arraylist to search id
			
			for (LeaveManagementPortal lmp : al) {
				
				if (ide == lmp.getId() && lmp.getLeaves() != 0 && lmp.getLeaves() >= lev) {

					lmp.setLeaves(lmp.getLeaves() - lev);
					
					System.out.println("Total Leaves Avilable : " + lmp.getLeaves());
					
					break;
				} else {
					
					System.out.println("Enter a valid Id : ");
					
				}
			}

		} catch (Exception e)

		{
			System.out.println(e);
		}

		finally

		{
			//calling doYouWantToContinue method
			
			doYouWantToContinue(al);
			
		}

	}

	//overriding showLeaves method of EmployeeInterfaces interface
	
	@Override
	public void showLeaves(ArrayList<LeaveManagementPortal> ar2) {

		try {

			System.out.println("Enter Id");
			
			int ide = scanner.nextInt();
			
			// using for loop to iterate among arraylist al to search id
			
			for (LeaveManagementPortal lmp : ar2) {
				
				if (ide == lmp.getId()) {

					System.out.println("Total leaves avilable"+lmp.getLeaves());
					
					break;
				} 
			}

		} catch (Exception e) {
			System.out.println(e);
		}

		finally {
			
			//calling doYouWantToContinue() method present at bottom of this file
			
			doYouWantToContinue(ar2);
			
		}

	}

	//overriding showEmployees method of EmployeeInterfaces interface
	
	@Override
	public void showEmployees(ArrayList<LeaveManagementPortal> al) {

		try {
			System.out.println("Enter Id");
			
			//creating local variable ide
			
			int ide = scanner.nextInt();
			
			// using for loop to iterate among arraylist al to show details of employe matches with given id
			
			for (LeaveManagementPortal lmp : al) {
				
				if (ide == lmp.getId()) {

					System.out.println(lmp);
					
					break;
				} 
			}
		} catch (Exception e)

			{
				System.out.println(e);
			}

		finally {
			doYouWantToContinue(al);
		}

	}

	public void doYouWantToContinue(ArrayList<LeaveManagementPortal> ar2) {
		System.out.println("Do you Want to continue (Y/N):");
		String choice = scanner.next();
		// System.out.println(choice);
		if (choice.equalsIgnoreCase("y")) {
			employee(ar2);// making use of recursion call to continue
		} else {
			Login l = new Login();
			l.login(ar2);// calling login method to go back
		}
		scanner.close();// closing scanner connection in finally block
	}
}
