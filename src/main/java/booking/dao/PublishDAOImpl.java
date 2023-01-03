package booking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import booking.model.Movie;
import booking.util.JdbcUtil;

public class PublishDAOImpl implements PublishDAO{

	@Override
	public void publishMovie(Movie movie) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = JdbcUtil.getConnection();
		String query = "insert into movie values(?,?,?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, 0);
		ps.setString(2, movie.getTitle());
		ps.setString(3, movie.getDescription());
		ps.setInt(4, movie.getDuration());
		ps.setString(5, movie.getLanguage());
		ps.setObject(6, movie.getReleaseDate());
		ps.setString(7, movie.getCountry());
		ps.setString(8, movie.getGenere());
		ps.execute();
	}

}
