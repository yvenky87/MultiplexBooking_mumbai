package booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import booking.util.JdbcUtil;

public class LoginDAOImpl implements LoginDAO{
	
	public ResultSet checkUserExistance(String username, String password) throws ClassNotFoundException, SQLException {
		Connection con = JdbcUtil.getConnection();
		String query = "select * from user where username=? and password=?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, username);
		ps.setString(2, password);
		return ps.executeQuery();
	}
}
