package booking.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import booking.model.Movie;

public interface QueryDAO {
	ResultSet fetchMovies() throws ClassNotFoundException, SQLException;
}
