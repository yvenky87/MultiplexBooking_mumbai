package booking.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import booking.dao.PublishDAO;
import booking.dao.PublishDAOImpl;
import booking.model.Movie;
import booking.util.JdbcUtil;

public class PublishServiceImpl implements PublishService{
	private PublishDAO publishDao = new PublishDAOImpl();
	 
	@Override
	public void publishMovie(Movie movie) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		publishDao.publishMovie(movie);
		
	}

}
