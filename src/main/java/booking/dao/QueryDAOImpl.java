package booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import booking.model.Movie;
import booking.util.JdbcUtil;

public class QueryDAOImpl implements QueryDAO{

	@Override
	public ResultSet fetchMovies() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = JdbcUtil.getConnection();
		String query = "select * from movie";
		PreparedStatement ps = con.prepareStatement(query);
		return ps.executeQuery();
	}

}
