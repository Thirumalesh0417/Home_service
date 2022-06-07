package RevatureProject1.com;

public class Login {

		con_database c = new con_database();
		public static String User_name,password;

		public String getUser_name() {
			return User_name;
			
		}

		public void setUser_name(String user_name) {
			User_name = user_name;
			
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String passwornd) {
			this.password = passwornd;
			
		}
		public boolean Update_password(String User_name,String password) {
			
			setUser_name(User_name);
			setPassword(password);
			
			try {
				c.checkUser();
				if(con_database.i == 1) {
					return true;
				}
				else {
					return false;
				}
				
			}catch(Exception e) {
				System.out.println("password not updated"+e);
				return false;
			}
			
			
		}
		public boolean create_acc(String User_name,String password) {
			
			try {
				setUser_name(User_name);
				setPassword(password);
				//System.out.println(getPassword()+getUser_name());
				
				c.checkUser();
				if(con_database.i == 1) {
					return true;
				}
				else {
					return false;
				}
			}catch(Exception e) {
				System.out.println("Account is not created "+e);
				return false;
			}
		}
		public boolean Validate_acc(String User_name ,String password){
		
			setUser_name(User_name);
			setPassword(password);
			c.checkUser();
			String str = c.ht.get(getUser_name());
			if(str.equals(getPassword())) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
	}


	


