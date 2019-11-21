package com.leave_management_portal2.einf;
import java.util.ArrayList;
import java.util.Scanner;

import com.leave_management_interfaces.einf.Logins;
// extending RegEmployeData and implementing Logins interface present in com.leave_management_interface.einf package
public class Login extends RegEmployeData implements Logins {
	//creating scanner object to take values from keyboard
	Scanner scanner = new Scanner(System.in);
	
	RegEmployeData r = new RegEmployeData();
	public void login(ArrayList<LeaveManagementPortal> ar)  {
		// creating boolean log variable
		boolean log=false;
			
		     try {
		    	 System.out.println("*****************Welcom To Leave Management portal Login Page *****************");
				 System.out.println();
			     System.out.println("Select any option below : ");
			     System.out.println("1.Employee Login");
			     System.out.println("2.Manager Login");
			     System.out.println("3.Admin Login");
			     System.out.println("******************************************************************************");
			    
			     int  opt=scanner.nextInt();
			     //using switch case to pass option	
		         switch(opt)
		         {
		         case 1: 
		          //calling eLogin() method which return if username present and false if user was not paresnt	 
		          log =   eLogin();
		          if(log==true) {
		        	    //creating object for EmployeBlog and calling employee() method
		        	  	EmployeBlog eb  = new EmployeBlog();
		        	  	eb.employee(ar);
		        	  	System.out.println("***************************************************************************************");
		        	  
		          }
		             break; 
		         case 2: 
		        	 log= eLogin();
		        	 if(log==true) {
		        	 //Creating Object for ManagerLogin and calling manager() method	 
		        	 ManagerLogin m = new ManagerLogin();
		        	 m.manager(ar);
		        	 System.out.println("***************************************************************************************");
		        	 }
			             break; 
		         case 3: 
		        	 log= eLogin();
		        	 if(log==true) {
		        	 Admin m = new Admin();
		        	 m.adminInfo(ar);
		        	 System.out.println("***************************************************************************************");
		        	 }
		        	 
			             break; 
		         	default: 
		             System.out.println("Enter a valied option :");
		             break; 
		        	 
		         }
		}
		catch(Exception e) {
		System.out.println(e);
		}
		finally {
			
			scanner.close();
		}
		
		
		
	}
//overriding eLogin() from Logins interface
	@Override
	public boolean eLogin() {
		
		System.out.println("Enter id :");
		int ide=scanner.nextInt();
		System.out.println("Enter password :");
		String pas = scanner.next();
		//creating Arrayalist of LeaveManagementPortal type
		ArrayList<LeaveManagementPortal> al = r.employeData(null) ;
		// using for loop to iterate among arraylist object
		for(LeaveManagementPortal lmp : al) {
			if(ide == lmp.getId() && pas == lmp.getPassword() && lmp.getDesig() != "manager" || lmp.getDesig() != "admin") {
				return true;
			}else if(ide == lmp.getId() && pas == lmp.getPassword() && lmp.getDesig() == "manager" || lmp.getDesig() == "admin" ) {
				return true;
			}else {
				return false;
			}
		}
		return false;
		
		
	}

}
