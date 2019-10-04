package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.ListTheater;

public class ListTheaterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MovieList");
	
	public void insertNewMovieDetail(ListTheater s) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		//Supposed to be a persist but was saying I have something wrong with it.
		em.merge(s);
		em.getTransaction().commit();
		em.close();
	}
	public List<ListTheater> getLists(){
		EntityManager em = emfactory.createEntityManager();
		List<ListTheater> allTheater = em.createQuery("SELECT i FROM ListTheater i").getResultList();
		return allTheater;
	}
	
	public ListTheater searchForListById(int idToEdit) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		ListTheater found = em.find(ListTheater.class, idToEdit);
		em.close();
		return found;
	}
	public void updateList(ListTheater toEdit) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		
		em.merge(toEdit);
		em.getTransaction().commit();
		em.close();

		
	}
}
