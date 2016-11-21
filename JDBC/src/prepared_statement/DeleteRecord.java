package prepared_statement;
import java.sql.*;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sonoo","root","root");  
		PreparedStatement stmt = con.prepareStatement("delete from emp where name =?");
		stmt.setString(1, "Rakesh");
		int i = stmt.executeUpdate();
		System.out.println(i+ " record deleted");
		con.close();
	}catch(Exception e){System.out.println(e);}

}
}
