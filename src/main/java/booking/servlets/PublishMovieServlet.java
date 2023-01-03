package booking.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import booking.model.Movie;
import booking.service.PublishService;
import booking.service.PublishServiceImpl;
import booking.util.MultiplexBookingUtil;

/**
 * Servlet implementation class PublishMovieServlet
 */
@WebServlet("/publish")
public class PublishMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PublishService publishService = new PublishServiceImpl();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PublishMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Preparing Movie Object
		
		Movie movie = MultiplexBookingUtil.convertToMovie(request);
		StringBuilder responseObject = new StringBuilder();
		try {
			publishService.publishMovie(movie);
			responseObject.append("Movie Added Successfully");
			request.setAttribute("response", responseObject);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			responseObject.append("Movie Failed to add please try again");
			request.getRequestDispatcher("/views/publish.jsp");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
