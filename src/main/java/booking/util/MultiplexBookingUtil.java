package booking.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import booking.model.Movie;

public class MultiplexBookingUtil {
	
	public static Movie convertToMovie(HttpServletRequest request) {
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int duration = Integer.parseInt(request.getParameter("duration"));
		String releaseDate = request.getParameter("releaseDate");
		String language = request.getParameter("language");
		String country = request.getParameter("country");
		String genere = request.getParameter("genre");
		LocalDate date = convertToLocalDate(releaseDate);
		Movie movie = new Movie(title, description,date,language, country, genere,duration);
		return movie;
	}
	
	public static LocalDate convertToLocalDate(String dateString) {
		String[] splittedDate = dateString.split("-");
		int day = Integer.parseInt(splittedDate[0]);
		int month = Integer.parseInt(splittedDate[1]);
		int year = Integer.parseInt(splittedDate[2]);
		
		LocalDate date = LocalDate.of(year, month, day);
		return date;
	}
	
	public static LocalDate convertSqlDatetoLocalDate(String dateString) {
		String[] splittedDate = dateString.split("-");
		int year = Integer.parseInt(splittedDate[0]);
		int month = Integer.parseInt(splittedDate[1]);
		int day = Integer.parseInt(splittedDate[2]);
		
		LocalDate date = LocalDate.of(year, month, day);
		return date;
	}
	
	public static List<Movie> convertResultSetToList(ResultSet set) throws SQLException{
		List<Movie> movies = new ArrayList();
		while(set.next()) {
			String title= set.getString("title");
			String description= set.getString("description");
			int duration= Integer.parseInt(set.getString("duration"));
			String language= set.getString("language");
			String releaseDate= set.getString("release_date");
			LocalDate date = convertSqlDatetoLocalDate(releaseDate);
			String country= set.getString("country");
			String genere= set.getString("genere");
			Movie movie = new Movie(title, description, date, language, country, genere, duration);
			movies.add(movie);
		}
		return movies;
	}
}
