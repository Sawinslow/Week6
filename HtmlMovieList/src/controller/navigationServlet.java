package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListMovies;

/**
 * Servlet implementation class navigationServlet
 */
@WebServlet("/navigationServlet")
public class navigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public navigationServlet() {
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
		String act = request.getParameter("doThisToMovie");
		if (act == null) {
			getServletContext().getRequestDispatcher("/viewAllMovieServlet").forward(request, response);
		} else if (act.equals("delete")) {
			try {
				Integer tempID = Integer.parseInt(request.getParameter("ID"));
				ListMovies MovieToDelete = mov.searchForMovieById(tempID);
				mov.deleteMovies(MovieToDelete);
			} catch (NumberFormatException e) {
				System.out.println("Please click a button");
			} finally {
				getServletContext().getRequestDispatcher("/viewAllMovieServlet").forward(request, response);
			}
		} else if (act.equals("edit")) {
			try {
				Integer tempID = Integer.parseInt(request.getParameter("ID"));
				ListMovies movieToEdit = mov.searchForMovieById(tempID);
				request.setAttribute("movieToEdit", movieToEdit);
				getServletContext().getRequestDispatcher("/edit-movie.jsp").forward(request,response);
			}catch (NumberFormatException e) {
				getServletContext().getRequestDispatcher("/viewAllMovieServlet").forward(request,response);
			}

		} else if (act.equals("add")) {
			getServletContext().getRequestDispatcher("/index.html").forward(request, response);
		}
		// doGet(request, response);
	}

}
