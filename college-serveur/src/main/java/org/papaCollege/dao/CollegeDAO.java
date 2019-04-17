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
		// TODO Auto-generated method stub
		
	}

	public void modifier(Colleges t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Colleges t) {
		// TODO Auto-generated method stub
		
	}

	public List<Colleges> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Colleges getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}



}
