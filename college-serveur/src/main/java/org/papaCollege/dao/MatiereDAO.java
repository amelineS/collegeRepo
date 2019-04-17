package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoMatiere")
public class MatiereDAO implements IMatiereDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void ajouter(Matiere t) {
		
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void modifier(Matiere t) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public void supprimer(Matiere t) {
		sessionFactory.getCurrentSession().merge(t);
		
	}

	public List<Matiere> afficher() {
		
		return sessionFactory.getCurrentSession().createQuery(" from Matiere m ").list();
	}

	public Matiere getById(int id) {
		// TODO Auto-generated method stub
		return (Matiere) sessionFactory.getCurrentSession().get(Matiere.class, id);
	}

	
	
	
}
