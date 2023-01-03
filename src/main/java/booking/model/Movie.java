package booking.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Movie {
	private Integer movieId;
	private String title;
	private String description;
	private LocalDate releaseDate;
	private String language;
	private String country;
	private String genere;
	private Integer duration;
	public Integer getMovieId() {
		return movieId;
	}
	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", description=" + description + ", releaseDate="
				+ releaseDate + ", language=" + language + ", country=" + country + ", genere=" + genere + ", duration="
				+ duration + "]";
	}
	public Movie(String title, String description, LocalDate releaseDate, String language,
			String country, String genere, Integer duration) {
		super();
		this.title = title;
		this.description = description;
		this.releaseDate = releaseDate;
		this.language = language;
		this.country = country;
		this.genere = genere;
		this.duration = duration;
	}
	
	
}
