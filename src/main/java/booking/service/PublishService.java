package booking.service;

import java.sql.SQLException;

import booking.model.Movie;

public interface PublishService {
	void publishMovie(Movie movie) throws ClassNotFoundException, SQLException;
		
}
