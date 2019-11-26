package com.leave_management_portal2.einf;

import java.util.ArrayList;
import java.util.Scanner;

//inheriting RegEmployeData

public class AdminHome extends RegEmployeData  {
	
	Scanner scanner = new Scanner(System.in);
	
	//creating object of ManagerHome
	
	ManagerHome ml = new ManagerHome();
	
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
				        	
				        	//calling leaveViewPage of RegEmployeData
				        	
				        	ml.leaveViewPage(as);
				        	
				        	System.out.println("***************************************************************************************");
				             
				        	break; 
				        
				         case 2: 
				        	 
				        	 //calling showEmployees() of super class EmployeBlog 
				        	 
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
					//calling doYouWantToContinue() of  super class EmployeBlog 
				
					ml.doYouWantToContinue(ar);	
					
					System.out.println("***************************************************************************************");
					
				}
	}

}
