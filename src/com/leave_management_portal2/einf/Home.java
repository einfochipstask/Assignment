package com.leave_management_portal2.einf;

import java.util.Scanner;



public class Home extends RegEmployeData {
	
 public void homeLmp() {
	 	 Scanner scanner = new Scanner(System.in);
		 System.out.println("***************Welcom To Leave Management portal****************");
		 System.out.println();
	     System.out.println("Select any option below : ");
	     System.out.println("1.login");
	     System.out.println("2.Employe Registration");
	     System.out.println("3.Exit");
	     System.out.println("****************************************************************");
	     
	     int  opt=scanner.nextInt();
		
	     try {
	    	//using switch case to pass selected  option
		         switch(opt)
		         {
		         case 1: 
		        	 //creating object of login class to call login() mathod
		        	 Login l = new Login();
		        	 l.login(employeData(null));
		            
		             break; 
		         case 2:
		        	 //creating object of employee registration class to call registration() mathod
		        	 EmployeeRegistration er = new EmployeeRegistration();
		        	 er.registration();
			         break;
		         case 3:
		        	 System.exit(0);// exit out of program
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
	
	
	
}
