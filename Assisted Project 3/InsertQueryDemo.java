package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		// String query = "INSERT INTO movies VALUES ('movie1,'comedy','director1','1985')";
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		// load the JDBC driver
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl, username, password);
		String title = "abc123";
		String genre = "comedy";
		String director = "director1";
		String release_year = "1999";
		
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)");
		
		

		ps.setString(1, title);
		ps.setString(2, genre);
		ps.setString(3, director);
		ps.setString(4, release_year);
		
		ps.executeUpdate();
		
		con.close();
		
		
		

	}

}
