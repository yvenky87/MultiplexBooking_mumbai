package booking.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import booking.dao.QueryDAO;
import booking.dao.QueryDAOImpl;
import booking.model.Movie;
import booking.util.MultiplexBookingUtil;

public class QueryServiceImpl implements QueryService{
	private QueryDAO dao = new QueryDAOImpl();
	
	@Override
	public List<Movie> fetchMovies() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		ResultSet set= dao.fetchMovies();
		List<Movie> movies = MultiplexBookingUtil.convertResultSetToList(set);
		return movies;
	}

}
