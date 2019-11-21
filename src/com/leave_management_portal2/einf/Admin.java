package com.leave_management_portal2.einf;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends RegEmployeData  {
	Scanner scanner = new Scanner(System.in);
	ManagerLogin ml = new ManagerLogin();
	public void adminInfo(ArrayList<LeaveManagementPortal> ar) {
		System.out.println("******************** Welcom To Leave Management portal Manager/Admin blog Page ***************");
		 System.out.println();
	     System.out.println("Select any option below : ");
	     System.out.println("1.View Leave Request List");
	     System.out.println("2.Show Employee");
	     System.out.println("***************************************************************************************");
	     int  opt = scanner.nextInt();
	     System.out.println("***************************************************************************************");
	     try 
		     {
		    	//passing option via switch
				switch(opt)
		         {
			         case 1:       	 
			        	ArrayList<LeaveStatus> as= leavePageData();
			        	ml.leaveViewPage(as);
			        	System.out.println("***************************************************************************************");
			             break; 
			        
			         case 2: 
			        	 //calling showEmployees() of EmployeBlog class
			        	 ml.showEmployees(ar);
			        	 System.out.println("***************************************************************************************");   
			        	 break; 
			         default: 
			             
			        	 System.out.println("Enter a valied option :");
			        	 System.out.println("***************************************************************************************");
			        	 break; 
			        	 
		         }
		     }
	     catch(Exception e)
			{ 
					System.out.println(e);
			}  
	
		
		finally
			{
				//calling doYouWantToContinue() of EmployeBlog class
				ml.doYouWantToContinue(ar);	
				System.out.println("***************************************************************************************");
				
			}
	}

}
