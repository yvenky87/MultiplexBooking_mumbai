package booking.service;

import java.sql.SQLException;
import java.util.List;

import booking.model.Movie;

public interface QueryService {
	List<Movie> fetchMovies() throws ClassNotFoundException, SQLException;
}
