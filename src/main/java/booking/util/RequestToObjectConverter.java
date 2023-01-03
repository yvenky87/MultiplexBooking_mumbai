package booking.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

import javax.servlet.http.HttpServletRequest;

import booking.model.Movie;

public class RequestToObjectConverter {
	
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
		Month month = Month.valueOf(splittedDate[1]);
		int year = Integer.parseInt(splittedDate[2]);
		
		LocalDate date = LocalDate.of(year, month, day);
		return date;
	}
}
