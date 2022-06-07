package RevatureProject1.com;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.Statement;

	import java.util.Scanner;


	public class Home_service {
		public static int acc=0;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str ="yes";
			Scanner sc = new Scanner(System.in);
			while(str == "yes") {
		    System.out.println("$$$$$$$$ WELCOME TO HOME SERVICES  $$$$$$$$$$$");
			System.out.println("Enter 1 for creating user account : ");
			System.out.println("Enter 2 for login user account : ");
			acc = sc.nextInt();
			System.out.println("Enter your User name : ");
			String User_name = sc.next();
			System.out.println("Enter your password : ");
			String password = sc.next();
			Login lg = new Login();
			if (acc == 1) {
				if(lg.create_acc(User_name, password)) {
					System.out.println("Account created successfully and returning to login page ");
					continue;
				}
				
				
			}
			else if(acc == 2) {
				if (lg.Validate_acc(User_name, password)) {
					System.out.println("logged in successfully ");
					System.out.println(" ");
					System.out.println("********** MAIN MENU ***********");
					System.out.println(" ");
					System.out.println("Enter 3 to update password : ");
					System.out.println("For Homeservices enter 4 :");
					System.out.println("To see your orders enter 5 :");
					
					acc = sc.nextInt();
	;				if(acc == 3) {
						System.out.println("Enter your New password: ");
						password = sc.next();
						
						if(lg.Update_password(User_name, password)) {
							System.out.println("your password updated successfully ");
						}
						else {
							System.out.println("password not updated ");
						}

			         }
	              Orders ord = new Orders();
	              if (acc == 4) {
	            	  System.out.println("Enter 1 for Painter service :");
	            	  System.out.println("Enter 2 for Cleaner service :");
	            	  System.out.println("Enter 3 for Gas repair service :");
	            	  int s = sc.nextInt();
	            	  String str1 = "Painter : Surendra | phone no : 9381851315 | charges per hr : 200 Rs ";
	            	  String str2 = "Cleaner: Narasimha | phone no : 7995896549 | charges per hr : 300 Rs ";
	            	  String str3 = "Gas service man : Saiteja | phone no : 9014734534 | charges per hr : 100 Rs ";
	            	  String str4 = null;
	            	  switch (s) {
	            	  case 1 : str4 = str1;
	            	           break;
	            	  case 2 : str4 = str2;
	   	                       break;
	            	  case 3 : str4 = str3;
	            	           break;
	            	  default:System.out.println("choose correct service ");
	            	  }
	            	  
	            	  
	                 System.out.println(str4);
	                 
	                 System.out.println(" ");
	            	 System.out.println("Enter 'yes' to conform order :");
	                 String o = sc.next();
	            	 if (o.equals("yes")){
	            	
	            		 ord.con(str4, 1);
	            	 }
	            	 else {
	            			  System.out.println("your order not confirmed");
	            	 }
	            	  
	              }
	              if(acc == 5) {
	            	  ord.con("mm", 2);
	              }

				}
				else {
						System.out.println("Entered password or username invalid ");
					}
				 
			

		     }
			System.out.println("Enter 'yes' to go main menu 'no' for exit :");
			String a =sc.next();
			if(a.equals("no")) {
				System.out.println("Thank You");
				break;
			}
		
			
	      }

	  }
	}


	
	


