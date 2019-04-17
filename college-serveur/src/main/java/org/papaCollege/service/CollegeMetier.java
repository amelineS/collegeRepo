package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.ICollegeDAO;
import org.papaCollege.entities.Colleges;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceCollege")
public class CollegeMetier implements IGestionCollegeMetier<Colleges> {

	@Autowired
	private ICollegeDAO dao;
	
	
	
	public CollegeMetier() {

	}

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
