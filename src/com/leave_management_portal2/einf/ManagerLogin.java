package com.leave_management_portal2.einf;
import java.util.ArrayList;
import java.util.Scanner;

import com.leave_management_interfaces.einf.ManagerInterface;

public class ManagerLogin extends EmployeBlog implements ManagerInterface {
	Scanner scanner = new Scanner(System.in);
	//overriding manager method of interface ManagerInterface
	@Override
	public void manager(ArrayList<LeaveManagementPortal> ar) {
		
	
		 System.out.println("******************** Welcom To Leave Management portal Manager/Admin blog Page ***************");
		 System.out.println();
	     System.out.println("Select any option below : ");
	     System.out.println("1.View Leave Request List");
	     System.out.println("2.Show Employee");
	     System.out.println("3.Take Leave");
	     System.out.println("4.Show Leaves");
	     System.out.println("***************************************************************************************");
	     int  opt = scanner.nextInt();
	     try 
		     {
		    	//passing option via switch
				switch(opt)
		         {
			         case 1:       	 
			        	ArrayList<LeaveStatus> as= leavePageData();
			        	leaveViewPage(as);
			        	System.out.println("***************************************************************************************");
			             break; 
			        
			         case 2: 
			        	 //calling showEmployees() of EmployeBlog class
			        	 showEmployees(ar);
			        	 System.out.println("***************************************************************************************");  
			        	 break; 
			         case 3: 
			        	 takeLeaves(ar);
							System.out.println("***************************************************************************************");
				             
			        	 break;
			         case 4: 
			        	 showLeaves(ar);
							System.out.println("***************************************************************************************");
				             
			        	 break;
			         default: 
			             
			        	 System.out.println("Enter a valied option :");
			             
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
				doYouWantToContinue(ar);	
				System.out.println("***************************************************************************************");
			}
		
	}
	//overriding leaveViewPage() of ManagerInterface 
	@Override
	public void leaveViewPage (ArrayList<LeaveStatus> a) {
		
		for(LeaveStatus ls : a) {
			System.out.println("ID :"+ls.getId()+"  Status : "+ls.getStatus()); 
			 System.out.println("Select any Action : ");
			 System.out.println("1.Approve");
			 System.out.println("2.Reject");
			 int sts= scanner.nextInt();
			 switch(sts)
			 {
			 case 1 : 
				 ls.setStatus("Approved");
				 break;
			 case 2 :
				 ls.setStatus("Rejected");
				 break;
				 
			 default :
				 
				 break;
			 
			 
			 }
			System.out.println(ls); 
			System.out.println("***************************************************************************************");
			
		}
		
		System.out.println(a); 
	}

	
	

}
