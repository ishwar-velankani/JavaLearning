package test;
import java.sql.*;

public class Scrollable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sonoo","root","root");
			Statement stmnt = con.createStatement();
			ResultSet rs= stmnt.executeQuery("select * from emp");
			rs.absolute(3);
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}

	}

}
