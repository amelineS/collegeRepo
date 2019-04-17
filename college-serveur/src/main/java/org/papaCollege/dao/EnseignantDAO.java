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
		
	}

	public void modifier(Enseignant t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Enseignant t) {
		// TODO Auto-generated method stub
		
	}

	public List<Enseignant> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Enseignant getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
