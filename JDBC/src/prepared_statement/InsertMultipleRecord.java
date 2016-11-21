package prepared_statement;
import java.sql.*;
import java.io.*;

public class InsertMultipleRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/sonoo","root","root");  
			PreparedStatement stmt = con.prepareStatement("insert into emp values (?,?,?)");
			//for taking the input
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do{
				System.out.println("Eneter id : ");
				int id = Integer.parseInt(br.readLine());
				System.out.println("Enter Name : ");
				String name = br.readLine();
				System.out.println("Eneter age : ");
				int age = Integer.parseInt(br.readLine());
				stmt.setInt(1, id);
				stmt.setString(2, name);
				stmt.setInt(3, age);
				int i = stmt.executeUpdate();
				System.out.println(i+" record affected");
				System.out.println(" Do you want to continue Y/N");
				String s= br.readLine();
				if(s.startsWith("n"))
					break;
			}while(true);
			con.close();
		}catch(Exception e){}

	}

}
