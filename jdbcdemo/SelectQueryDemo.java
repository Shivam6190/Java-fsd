package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// We should connect to database
		//load the driver 
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. connect ot the DB -> use class DriverManager and method getConnection(DBURL,username.password)
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		
		System.out.println("Successfully connected to Database");
		
		//Run q query on the DB
		
		String query = "select * from movies where title='Inside Out'";
		
		//send query to database
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next()) {
			System.out.print("Title: " + rs.getString("title") + "\t");
			System.out.print("genre: " + rs.getString("genre") + "\t");
			System.out.print("Director: " + rs.getString("director") + "\t");
			System.out.println("release_year: " + rs.getString("release_year") + "\t");
			
		}
		
		//close the connection
		con.close();
		
		
		
		
	}

}
