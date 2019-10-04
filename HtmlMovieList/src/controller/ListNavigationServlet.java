package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ListMovies;
import model.ListTheater;

/**
 * Servlet implementation class ListNavigationServlet
 */
@WebServlet("/ListNavigationServlet")
public class ListNavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListNavigationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ListTheaterHelper ldh = new ListTheaterHelper();
		String act = request.getParameter("doThisToItem");

		if (act.equals("edit")) {
			try {
				Integer tempId = Integer.parseInt(request.getParameter("id"));
				ListTheater listToEdit = ldh.searchForListById(tempId);
				MovieListHelper lih = new MovieListHelper();
				List<ListMovies> allItems = lih.showAllMovies();
				List<ListMovies> currentListItems = listToEdit.getListOfMovies();

				System.out.println("----After removing items-------");
				for (int i = 0; i < allItems.size(); i++) {
					for (int j = 0; j < currentListItems.size(); j++) {
						if (allItems.get(i).getId() == currentListItems.get(j).getId()) {
							allItems.remove(i);
						}
					}
				}

				request.setAttribute("TheMovies", listToEdit);
				request.setAttribute("AllMoviesListed", allItems);
				getServletContext().getRequestDispatcher("/edit-movie.jsp").forward(request, response);
			} catch (NumberFormatException e) {
				getServletContext().getRequestDispatcher("/viewAllListsServlet").forward(request, response);
			}

		} else if (act.equals("add")) {
			getServletContext().getRequestDispatcher("/addMoviesForListServlet").forward(request, response);
		}
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
