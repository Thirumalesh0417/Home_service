package RevatureProject1.com;



			import java.sql.Connection;
			import java.sql.DriverManager;
			import java.sql.PreparedStatement;
			import java.sql.ResultSet;
			import java.sql.Statement;
			import java.util.HashMap;


			public class con_database {
			public static int i =0;
			//public static String User_name,password;
			public HashMap<String,String> ht = new HashMap<String,String>();
			   public void checkUser() {
			     
			     Login lg = new Login();{
			try{  

			      //test is the db name root and root123 are user name and password  
			        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/HomeserviceAppData?autoRecoonect=true&useSSL=false","root","Thiru@0417");
			        Statement stmt=con.createStatement();
			       
			       
			       
			        if(Home_service.acc == 1) {
			        PreparedStatement st = con.prepareStatement("insert into Userdata(User_name,password) values (? , ? )");
			        st.setString(1,lg.getUser_name());
			        st.setString(2,lg.getPassword());
			       // System.out.println(lg.getPassword()+lg.getUser_name()+Home_service.acc);
			        i = st.executeUpdate();
			       
			        }
			        else if (Home_service.acc == 3) {
			        PreparedStatement st = con.prepareStatement("update Userdata set password = ? where User_name = ? " );
			        st.setString(2,lg.getUser_name());
			        st.setString(1,lg.getPassword());
			        i = st.executeUpdate();
			        }
			     
			   
			        // Executing SQL query  
			        ResultSet rs=stmt.executeQuery("select * from Userdata");    
			    //   boolean b=rs.next();
			      // System.out.println(b);
			        while(rs.next()){    
			            // System.out.println(rs.getString(1));
			            // System.out.println(rs.getString(2));
			             ht.put(rs.getString(1), rs.getString(2));
			           
			        }  
			        // Closing connection  
			        con.close();      
			}catch(Exception e){ System.out.println("error connecting db"+e);
			}
			}
			   }
			}





