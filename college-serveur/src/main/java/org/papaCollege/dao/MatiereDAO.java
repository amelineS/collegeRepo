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
		// TODO Auto-generated method stub
		
	}

	public void modifier(Matiere t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Matiere t) {
		// TODO Auto-generated method stub
		
	}

	public List<Matiere> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Matiere getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
