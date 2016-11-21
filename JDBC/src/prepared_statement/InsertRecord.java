package prepared_statement;
import java.sql.*;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sonoo","root","root");  
		PreparedStatement stmt = con.prepareStatement("insert into emp values (?,?,?)");
		stmt.setInt(1, 4);
		stmt.setString(2, "Ravi");
		stmt.setInt(3, 41);
		int i = stmt.executeUpdate();
		System.out.println(i+ " record inserted");
		con.close();
	}catch(Exception e){System.out.println(e);}

}
}
