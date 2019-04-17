package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoPersonne")
public class PersonneDAO implements IPersonneDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	public void ajouter(Personne t) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void modifier(Personne t) {
		sessionFactory.getCurrentSession().update(t);
		
	}

	public void supprimer(Personne t) {
		sessionFactory.getCurrentSession().delete(t);
		
	}

	public List<Personne> afficher() {
		return  sessionFactory.getCurrentSession().createQuery(" from Personne m ").list();
	}

	public Personne getById(int id) {
		return (Personne) sessionFactory.getCurrentSession().get(Personne.class, id);
	}
	
	

	

}
