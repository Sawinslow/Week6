package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListMovies;
import model.ListTheater;
import model.theater;

/**
 * Servlet implementation class createNewListServlet
 */
@WebServlet("/createNewListServlet")
public class createNewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public createNewListServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		MovieListHelper lih = new MovieListHelper();
		String listName = request.getParameter("ListName");
		System.out.println("List Name: " + listName);
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");
		String TheaterName = request.getParameter("TheaterName");
		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		String[] selectedMovies = request.getParameterValues("allMoviesToAdd");
		List<ListMovies> selectedMoviesInList = new ArrayList<ListMovies>();

		if (selectedMovies != null && selectedMovies.length > 0) {
			for (int i = 0; i < selectedMovies.length; i++) {
				System.out.println(selectedMovies[i]);
				ListMovies c = lih.searchForMovieById(Integer.parseInt(selectedMovies[i]));
				selectedMoviesInList.add(c);
			}
		}
		theater theater = new theater(TheaterName);
		ListTheater sld = new ListTheater(TheaterName, ld, theater);
		sld.setListOfMovies(selectedMoviesInList);
		ListTheaterHelper slh = new ListTheaterHelper();
		slh.insertNewMovieDetail(sld);

		System.out.println("Success!");
		System.out.println(sld.toString());
		getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
