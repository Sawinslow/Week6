package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.NoResultException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListMovies;
import model.ListTheater;
import model.theater;

/**
 * Servlet implementation class editExistingTheaterServlet
 */
@WebServlet("/editExistingTheaterServlet")
public class editExistingTheaterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public editExistingTheaterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// import all helpers
		ListTheaterHelper slh = new ListTheaterHelper();
		MovieListHelper lih = new MovieListHelper();
		TheaterHelper sh = new TheaterHelper();

		// search for object to make changes to
		int idToEdit = Integer.parseInt(request.getParameter("id"));
		ListTheater toEdit = slh.searchForListById(idToEdit);

		// update the listName first This would be in the list movies class but does not make sense
		String listName = request.getParameter("listName");
		System.out.println("List Name: " + listName);
		toEdit.setListName(listName);

		// update the date
		String month = request.getParameter("month");
		String day = request.getParameter("day");
		String year = request.getParameter("year");

		LocalDate ld;
		try {
			ld = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
		} catch (NumberFormatException ex) {
			ld = LocalDate.now();
		}
		toEdit.setTripDate(ld);

		// update the shopper
		String theatername = request.getParameter("theatername");
		theater theater;
		
		try {
			theater = sh.searchForTheaterByName(theatername);
		} catch (NoResultException ex) {
			theater = new theater(theatername);
		} catch (Exception ex) {
			theater = new theater(theatername);
		}

		toEdit.setTheater(theater);

		// update the list of items
		List<ListMovies> previousListOfItems = toEdit.getListOfMovies();

		String[] selectedItems = request.getParameterValues("itemsToAdd");
		List<ListMovies> selectedMoviesInList = new ArrayList<ListMovies>();

		if (selectedItems != null && selectedItems.length > 0) {
			for (int i = 0; i < selectedItems.length; i++) {
				System.out.println(selectedItems[i]);
				ListMovies c = lih.searchForMovieById(Integer.parseInt(selectedItems[i]));
				selectedMoviesInList.add(c);

			}

			previousListOfItems.addAll(selectedMoviesInList);
		}

		toEdit.setListOfMovies(previousListOfItems);

		slh.updateList(toEdit);

		System.out.println("Success!");
		System.out.println(toEdit.toString());
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
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
