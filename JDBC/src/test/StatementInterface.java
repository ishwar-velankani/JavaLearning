package test;
import java.sql.*;

public class StatementInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/sonoo","root","root");
			Statement stmnt = con.createStatement();
			int result = stmnt.executeUpdate("delete from emp where id=1");
			System.out.print(result+"records affected");
			con.close();
		}
		catch(Exception e)
		{System.out.println(e);}

	}

}
