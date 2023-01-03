package booking.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface LoginDAO {
	public ResultSet checkUserExistance(String username, String password) throws ClassNotFoundException, SQLException;
}
