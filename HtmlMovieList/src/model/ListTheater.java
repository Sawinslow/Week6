package model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "list_theater")
public class ListTheater {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "List_ID")
	private int id;
	@Column(name = "LIST_NAME")
	private String listName;
	@Column(name = "TRIP_DATE")
	private LocalDate tripDate;
	@ManyToOne
	@JoinColumn(name = "theater_id")
	private theater theater;
	@OneToMany(cascade= CascadeType.PERSIST, fetch=FetchType.EAGER)
		@JoinTable(
				// Have error here with join Columns Need to figure out what is wrong
				name="movies_on_list",joinColumns= {@JoinColumn(name="ID",referencedColumnName="List_ID")},
				inverseJoinColumns= {@JoinColumn(name="movie_id",referencedColumnName="ID",unique=true)}
				)
	
	private List<ListMovies> listOfMovies;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public LocalDate getTripDate() {
		return tripDate;
	}

	public void setTripDate(LocalDate tripDate) {
		this.tripDate = tripDate;
	}

	public theater getTheater() {
		return theater;
	}

	public void setTheater(theater theater) {
		this.theater = theater;
	}

	public List<ListMovies> getListOfMovies() {
		return listOfMovies;
	}

	public void setListOfMovies(List<ListMovies> listOfMovies) {
		this.listOfMovies = listOfMovies;
	}

	public ListTheater(int id, String listName, LocalDate tripDate, theater theater, List<ListMovies> listOfMovies) {
		
	}

	public ListTheater(String listName, LocalDate tripDate, theater theater, List<ListMovies> listOfMovies) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.theater = theater;
		this.listOfMovies = listOfMovies;
		
	}

	public ListTheater(String listName, LocalDate tripDate, theater theater) {
		super();
		this.listName = listName;
		this.tripDate = tripDate;
		this.theater = theater;
		
	}

	public ListTheater() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ListTheater [id=" + id + ", listName=" + listName + ", tripDate=" + tripDate + ", theater=" + theater
				+ ", listOfMovies=" + listOfMovies + "]";
	}
	
}
