package prepared_statement;
import java.sql.*;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sonoo","root","root");  
		PreparedStatement stmt = con.prepareStatement("update emp set name =? where id =?");
		stmt.setString(1, "Rakesh");
		stmt.setInt(2, 2);
		int i = stmt.executeUpdate();
		System.out.println(i+ " record updated");
		con.close();
	}catch(Exception e){System.out.println(e);}

}
}
