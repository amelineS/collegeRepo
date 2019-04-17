package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoCollege")
public class CollegeDAO implements ICollegeDAO{
	 
	@Autowired
	private SessionFactory sessionFactory;

	public void ajouter(Colleges t) {
		
		sessionFactory.getCurrentSession().merge(t);
	}

	public void modifier(Colleges t) {
		
		sessionFactory.getCurrentSession().update(t);	
	}

	public void supprimer(Colleges t) {
		
		sessionFactory.getCurrentSession().delete(t);	
	}

	public List<Colleges> afficher() {

		return sessionFactory.getCurrentSession().createQuery("from Colleges c").list();
	}

	public Colleges getById(int id) {
		
		return (Colleges) sessionFactory.getCurrentSession().get(Colleges.class, id);
	}



}
