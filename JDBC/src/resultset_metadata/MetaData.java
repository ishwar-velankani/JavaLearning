package resultset_metadata;
import java.sql.*;

public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/sonoo","root","root");  
		PreparedStatement stmt = con.prepareStatement("select * from emp");
		ResultSet rs= stmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		System.out.println("Total Columns : "+rsmd.getColumnCount());
		int t= rsmd.getColumnCount();
		while(t>0){
			System.out.print("Column Name : "+rsmd.getColumnName(t));
			System.out.println(" Column Type : "+rsmd.getColumnTypeName(t));
			t--;
		}
		con.close();
	}catch(Exception e){System.out.println(e);}

}
}
