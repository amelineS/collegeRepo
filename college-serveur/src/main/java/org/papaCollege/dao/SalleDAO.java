package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Noter;
import org.papaCollege.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoSalle")
public class SalleDAO implements ISalleDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void ajouter(Salle t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(t);
	}

	public void modifier(Salle t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);

	}

	public void supprimer(Salle t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);

	}

	public List<Salle> afficher() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("select t from " + Salle.class.getName() + " t").list();
	}

	public Salle getById(int id) {
		// TODO Auto-generated method stub
		return (Salle) 	sessionFactory.getCurrentSession().get(Salle.class, id);
	}
	
	
}
