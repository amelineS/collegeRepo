package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Colleges;
import org.papaCollege.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoDepartement")
public class DepartementDAO implements IDepartementDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void ajouter(Departement t) {
		
		sessionFactory.getCurrentSession().merge(t);
	}

	public void modifier(Departement t) {
		
		sessionFactory.getCurrentSession().update(t);
	}

	public void supprimer(Departement t) {
		
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<Departement> afficher() {
		
		return sessionFactory.getCurrentSession().createQuery("from Departement d").list();
	}

	public Departement getById(int id) {

		return (Departement) sessionFactory.getCurrentSession().get(Departement.class, id);
	}
	
	
}