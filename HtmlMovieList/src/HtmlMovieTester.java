import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.AttributeConverter;
import controller.ListTheaterHelper;
import controller.TheaterHelper;
import model.ListMovies;
import model.ListTheater;
import model.theater;

public class HtmlMovieTester {

	public static void main(String[] args) {
		theater thing = new theater("Place");

		TheaterHelper th = new TheaterHelper();

		ListTheaterHelper lth = new ListTheaterHelper();
		
		ListMovies avengers = new ListMovies("Avengers", 4 , "Iron Man");
		ListMovies captinamerica = new ListMovies("Captin America", 7 , "America");
		
		List<ListMovies> PlaceMovies = new ArrayList<ListMovies>();
		
		PlaceMovies.add(avengers);
		PlaceMovies.add(captinamerica);

		ListTheater Placelist = new ListTheater("Testing List", LocalDate.now(), thing);
		
		Placelist.setListOfMovies(PlaceMovies);

		lth.insertNewMovieDetail(Placelist);

		List<ListTheater> allTheater = lth.getLists();

		for (ListTheater a : allTheater) {
			System.out.println(a.toString());
		}

	}

}
