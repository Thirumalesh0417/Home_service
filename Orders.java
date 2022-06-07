package RevatureProject1.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Orders {
	public void con(String sql,int i){
	
	 try{  
		 
	       //test is the db name root and root123 are user name and password  
		    
	         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HomeserviceAppData?autoRecoonect=true&useSSL=false","root","Thiru@0417");
	       //  System.out.println("******your order confirmed successfully*******");
	         if (i == 1) {
	        	 
	        	 PreparedStatement st = con.prepareStatement("update Userdata set orders =? where User_name = ?");
	        	
	        	 //System.out.println("*************************"+sql+" "+Login.User_name);
	        	 st.setString(1, sql);
	        	 st.setString(2, Login.User_name );
	        	// System.out.println("*************************"+sql+" "+Login.User_name);
	        	 int l = 0;
	        	// System.out.println("*************************"+sql+" "+Login.User_name+" "+l);
	        	 l= st.executeUpdate();
	             //System.out.println("*************************"+sql+" "+Login.User_name+" "+l);
	        	 
	        	 if(l == 1) {
	        		 System.out.println("*****YOUR ORDER CONFIRMED SUCCESSFULLY*****");
	        		 System.out.println(" ");
	        	 }
	         }
	         else if(i == 2) {
	        	 PreparedStatement st = con.prepareStatement("select orders from Userdata where User_name = ?");
	        	 st.setString(1, Login.User_name );
	        	 ResultSet rs = st.executeQuery();
	        	 while(rs.next()) {
	        		 System.out.println(rs.getString(1));
	        	 }
	         }
	         
	         

}catch(Exception e){
	
}
}
}
