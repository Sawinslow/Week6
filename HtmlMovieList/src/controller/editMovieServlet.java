package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListMovies;

/**
 * Servlet implementation class editMovieServlet
 */
@WebServlet("/editMovieServlet")
public class editMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public editMovieServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		MovieListHelper mov = new MovieListHelper();
		String movie = request.getParameter("movie");
		String rating = request.getParameter("rating");
		String maincharacter = request.getParameter("maincharacter");

		Integer tempID = Integer.parseInt(request.getParameter("ID"));

		ListMovies MovietoUpdate = mov.searchForMovieById(tempID);

		MovietoUpdate.setMovie(movie);

		int rate = Integer.parseInt(rating);
		MovietoUpdate.setRaiting(rate);

		MovietoUpdate.setMainCharacter(maincharacter);

		mov.updateItem(MovietoUpdate);

		getServletContext().getRequestDispatcher("/viewAllMovieServlet").forward(request, response);

		// doGet(request, response);
	}

}
