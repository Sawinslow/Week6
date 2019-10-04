import java.util.List;
import java.util.Scanner;

import controller.MovieListHelper;
import model.ListMovies;

public class MovieStart {
	static Scanner in = new Scanner(System.in);
	static MovieListHelper mlh = new MovieListHelper();
	
	public static void runMovie() {
		boolean notDone = true;
		System.out.println("---> Welcome to the Winslow's Movie Playlist <---");
		while (notDone) {
			System.out.println("-->  Please choose one of the following input:");
			System.out.println("	-->  1: View the Movie list");
			System.out.println("	-->  2: Add a Movie");
			System.out.println("	-->  3: Delete a Movie");
			System.out.println("	-->  4: Edit an existing Movie");
			System.out.println("	-->  5: Close Winslow's Playlist");
			System.out.print("	-->  What do you choose?: ");
			int input = in.nextInt();
			in.nextLine();

			if (input == 1) {
				viewTheMovieList();
			} else if (input == 2) {
				 addAMovie();
			} else if (input == 3) {
				deleteAMovie();
			} else if (input == 4) {
				editAMovie();
			} else {
				mlh.cleanUp();
				System.out.println("   -->Hoped you had fun at the Winslow's Movie Playlist!<--   ");
				notDone = false;
			}
		}
	}

	private static void viewTheMovieList() {
		List<ListMovies> listofitems = mlh.showAllMovies();
		for (ListMovies oneMovie : listofitems) {
			System.out.println(oneMovie.returnMovieDetails());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runMovie();

	}

	private static void addAMovie() {
		// TODO Auto-generated method stub
		System.out.print("Enter the movie: ");
		String movie = in.nextLine();
		System.out.println("Enter the raitings");
		int raiting = in.nextInt();
		System.out.print("Enter the Main Character: ");
		String maincharacter = in.nextLine();
		maincharacter = in.nextLine();

		ListMovies toAdd = new ListMovies(movie, raiting, maincharacter);
		mlh.insertMovie(toAdd);

	}

	private static void deleteAMovie() {
		// TODO Auto-generated method stub
		System.out.print("Enter the Movie to delete: ");
		String movie = in.nextLine();
		System.out.print("Enter the Raiting to delete: ");
		int raiting = in.nextInt();
		System.out.println("Enter the Main Character to delete:");
		String maincharacter = in.nextLine();
		maincharacter = in.nextLine();
		ListMovies toDelete = new ListMovies(movie, raiting, maincharacter);
		mlh.deleteMovies(toDelete);

	}

	private static void editAMovie() {
		// TODO Auto-generated method stub
		System.out.println("How would you like to search? ");
		System.out.println("1 : Search by Movie");
		System.out.println("2 : Search by Raiting");
		System.out.println("3 : Search by Main Character");
		int searchBy = in.nextInt();
		in.nextLine();

		List<ListMovies> foundMovie;
		if (searchBy == 1) {
			System.out.print("Enter the Movie: ");
			String movie = in.nextLine();
			foundMovie = mlh.searchForMoviesByMovie(movie);

		} else if (searchBy == 2) {
			System.out.print("Enter the Raiting: ");
			int Raiting = in.nextInt();
			foundMovie = mlh.searchForMoviesByRaiting(Raiting);

		} else {
			System.out.println("Enter the Main Character");
			String MainCharacter = in.nextLine();
			foundMovie = mlh.searchForMoviesByMainCharacter(MainCharacter);
		}

		if (!foundMovie.isEmpty()) {
			System.out.println("Found Results.");
			for (ListMovies m : foundMovie) {
				System.out.println(m.getId() + " : " + m.toString());
			}
			System.out.print("Which ID to edit: ");
			int idToEdit = in.nextInt();

			ListMovies toEdit = mlh.searchForMovieById(idToEdit);
			System.out.println("Retrieved " + toEdit.getMovie() + " from " + toEdit.getRaiting() + " Main Character: "
					+ toEdit.getMainCharacter());
			System.out.println("1 : Update Movie");
			System.out.println("2 : Update Raiting");
			System.out.println("3 : Update Main Character");
			int update = in.nextInt();
			in.nextLine();

			if (update == 1) {
				System.out.print("New Movie: ");
				String newStore = in.nextLine();
				toEdit.setMovie(newStore);
			} else if (update == 2) {
				System.out.print("New Raiting: ");
				int Raiting = in.nextInt();
				toEdit.setRaiting(Raiting);
			} else if (update == 3) {
				System.out.println("New Main Character: ");
				String newMainCharacter = in.nextLine();
				toEdit.setMainCharacter(newMainCharacter);
			}

			mlh.updateItem(toEdit);

		} else {
			System.out.println("---> No results found <---");
		}
	}
}
