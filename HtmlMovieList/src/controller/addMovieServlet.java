package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListMovies;

/**
 * Servlet implementation class addMovieServlet
 */
@WebServlet("/addMovieServlet")
public class addMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Movie = request.getParameter("movie");
		int Rating = Integer.parseInt(request.getParameter("Raiting"));
		String MainCharacter = request.getParameter("MainCharacter");
		
		ListMovies mo = new ListMovies(Movie,Rating,MainCharacter);
		MovieListHelper mov = new MovieListHelper();
		mov.insertMovie(mo);
		getServletContext().getRequestDispatcher("/index.html").forward(request,response);
	}

}
