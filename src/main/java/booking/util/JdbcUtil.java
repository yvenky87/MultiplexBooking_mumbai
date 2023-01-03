package booking.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	// Providing the Connection object
	public static Connection getConnection() throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/multiplex_booking", "root", "root");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Connection Error");
		}
		return con;
	}
}
