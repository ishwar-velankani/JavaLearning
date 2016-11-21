package image;

import java.sql.*;  
import java.io.*;  
public class StoreImage {  
public static void main(String[] args) {  
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sonoo","root","root");  
		PreparedStatement ps=con.prepareStatement("insert into imagetable values(?,?)");  
		ps.setString(1,"cat");  
		FileInputStream fin=new FileInputStream("/home/local/BLR/ishwar.kumar/Downloads/cat.jpg"); 
		ps.setBinaryStream(2,fin,fin.available());  
		int i=ps.executeUpdate();  
		System.out.println(i+" records affected");  
          
		con.close();  
	}catch (Exception e) {e.printStackTrace();}  
	}  
}  