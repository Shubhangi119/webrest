package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class commenthandlercopy {
public String InsercommentToDatabase(Connection dbConnect, String[] data, String username , String comments) throws Exception {
		String comm;

		try {
			System.out.println(data[0]);
			PreparedStatement ps = dbConnect.prepareStatement("INSERT INTO usercomments values ( '"+data[0]+"', '"+data[1]+"');");
		
			ps.executeUpdate();
			 
			PreparedStatement ds=dbConnect.prepareStatement("select comments from usercomments where username='"+username+"';"); 
			ResultSet rs=ds.executeQuery();
			rs.next();
			 comm = rs.getString(1);
			
			} catch (Exception e) {

				System.out.println("Sign Up Handler Error found : "+e.getMessage());
				throw e;
			}
		 return comm;

		
		}
}
	
