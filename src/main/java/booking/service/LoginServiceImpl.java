package booking.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import booking.dao.LoginDAO;
import booking.dao.LoginDAOImpl;

public class LoginServiceImpl implements LoginService{
	private LoginDAO dao = new LoginDAOImpl();

	@Override
	public boolean validateUser(String username, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ResultSet set= dao.checkUserExistance(username, password);
		boolean isUserExist = false;
		while(set.next()) {
			isUserExist = true;
		}
		
		return isUserExist;
	}
	
	
}
