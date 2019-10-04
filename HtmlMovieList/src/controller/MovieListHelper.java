package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListMovies;

public class MovieListHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MovieList");

	public void insertMovie(ListMovies mo) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(mo);
		em.getTransaction().commit();
	}

	public List<ListMovies> showAllMovies() {
		EntityManager em = emfactory.createEntityManager();
		List<ListMovies> allItems = em.createQuery("SELECT i FROM ListMovies i").getResultList();
		return allItems;
	}

	public void deleteMovies(ListMovies toDelete) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListMovies> typedQuery = em.createQuery(
				"Select mo from ListMovies mo where mo.Movie = :selectedMOVIE and mo.Raiting = :selectedRAITING and mo.MainCharacter = :selectedMAINCHARACTER",
				ListMovies.class);

		typedQuery.setParameter("selectedMOVIE", toDelete.getMovie());
		typedQuery.setParameter("selectedRAITING", toDelete.getRaiting());
		typedQuery.setParameter("selectedMAINCHARACTER", toDelete.getMainCharacter());

		typedQuery.setMaxResults(1);

		ListMovies result = typedQuery.getSingleResult();

		em.remove(result);
		em.getTransaction().commit();
		em.close();

	}

	public List<ListMovies> searchForMoviesByMovie(String movie) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListMovies> typedQuery = em.createQuery("select mo from ListMovies mo where mo.Movie =:selectedMOVIE", ListMovies.class);
		typedQuery.setParameter("selectedMOVIE", movie);
		List<ListMovies> foundMovies = typedQuery.getResultList();
		em.close();
		return foundMovies;
	}

	public List<ListMovies> searchForMoviesByRaiting(int Raiting) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListMovies> typedQuery = em.createQuery("select mo from ListMovies mo where mo.Raiting =:selectedRAITING", ListMovies.class);
		typedQuery.setParameter("selectedRAITING", Raiting);
		List<ListMovies> foundMovies = typedQuery.getResultList();
		em.close();
		return foundMovies;
	}

	public List<ListMovies> searchForMoviesByMainCharacter(String mainCharacter) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<ListMovies> typedQuery = em.createQuery("select mo from ListMovies mo where mo.MainCharacter =:selectedMAINCHARACTER", ListMovies.class);
		typedQuery.setParameter("selectedMAINCHARACTER", mainCharacter);
		List<ListMovies> foundMovies = typedQuery.getResultList();
		em.close();
		return foundMovies;
	}

	public ListMovies searchForMovieById(int idToEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListMovies found = em.find(ListMovies.class, idToEdit);
		em.close();
		return found;
	}

	public void updateItem(ListMovies toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();

	}

	public void cleanUp() {
		emfactory.close();

	}

}
