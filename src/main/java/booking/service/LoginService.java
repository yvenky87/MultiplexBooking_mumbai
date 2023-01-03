package booking.service;

import java.sql.SQLException;

public interface LoginService {
	public boolean validateUser(String username, String password) throws ClassNotFoundException, SQLException;
}
