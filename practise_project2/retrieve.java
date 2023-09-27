package practise_project2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class retrieve {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// We should connect to database
		//load the driver 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. connect ot the DB -> use class DriverManager and method getConnection(DBURL,username.password)
		String dburl = "jdbc:mysql://localhost:3306/product";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		System.out.println("Successfully connected to Database");
		
		//Run q query on the DB
		
		String query = "select * from product where product_id=001";
		
		//send query to database
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Product ID: " + rs.getString("product_id") + " \t");
			System.out.print("Product: " + rs.getString("product_details") + " \t");
			System.out.print("Category: " + rs.getString("category") + " \t");
			System.out.println("Price: " + rs.getString("price") + " \t");
			
		}
		
		//close the connection
		con.close();
		
		
		
		
	}

}
