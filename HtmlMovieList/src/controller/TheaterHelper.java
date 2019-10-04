package controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import model.ListTheater;
import model.theater;

public class TheaterHelper {
	static EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("MovieList");
	
	public void insertTheater(theater t) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(t);
		em.getTransaction().commit();
		em.close();
		
	}
	public List<theater> showAllTheater(){
		EntityManager em = emfactory.createEntityManager();
		List<theater> allTheater = em.createQuery("Select s FROM theater s").getResultList();
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
	public theater searchForTheaterByName(String theatername) {
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<theater> typedQuery = em.createQuery("select t from theater t where t.theater = :theatername", theater.class);
		typedQuery.setParameter("selectedName", theatername);
		typedQuery.setMaxResults(1);

		theater found = typedQuery.getSingleResult();
		em.close();
		return found;
	}
}
