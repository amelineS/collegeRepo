package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoNoter")
public class NoterDAO implements INoterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void ajouter(Noter t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Noter t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Noter t) {
		// TODO Auto-generated method stub
		
	}

	public List<Noter> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Noter getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
