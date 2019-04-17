package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoDepartement")
public class DepartementDAO implements IDepartementDAO{

	@Autowired
	private SessionFactory sessionFactory;

	public void ajouter(Departement t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Departement t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Departement t) {
		// TODO Auto-generated method stub
		
	}

	public List<Departement> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Departement getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}