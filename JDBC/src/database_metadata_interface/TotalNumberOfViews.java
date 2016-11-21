/*
 * Print total number of table sin the database
 */
package database_metadata_interface;

import java.sql.*;

public class TotalNumberOfViews {
	public static void main(String []args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/sonoo","root","root");  
			DatabaseMetaData dbmd=con.getMetaData(); 
			String table[] ={"VIEW"};
			ResultSet rs = dbmd.getTables(null, null, null, table);
			while(rs.next()){
				System.out.println(rs.getString(3));
			} 
			
		}
		catch(Exception e){}
		
	}
	

}
