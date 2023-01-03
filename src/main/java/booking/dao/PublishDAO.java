package booking.dao;

import java.sql.SQLException;

import booking.model.Movie;

public interface PublishDAO {
	void publishMovie(Movie movie) throws ClassNotFoundException, SQLException;
}
