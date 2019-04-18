package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoEnseignant")
public class EnseignantDAO implements IEnseignantDAO{

	

	@Autowired
	private SessionFactory sessionFactory;

	public void ajouter(Enseignant t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(t);
	}

	public void modifier(Enseignant t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	public void supprimer(Enseignant t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<Enseignant> afficher() {
		// TODO Auto-generated method stub
		List<Enseignant> liste= sessionFactory.getCurrentSession().createQuery("select t from " + Enseignant.class.getName() +" t").list();
		return liste;
	}

	public Enseignant getById(int id) {
		// TODO Auto-generated method stub
		return (Enseignant) sessionFactory.getCurrentSession().get(Enseignant.class, id);
	}
	
	
	
}
