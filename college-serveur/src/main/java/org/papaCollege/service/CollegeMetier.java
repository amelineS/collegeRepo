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
		
		dao.ajouter(t);
	}

	public void modifier(Colleges t) {
		
		dao.modifier(t);
	}

	public void supprimer(Colleges t) {
		
		dao.supprimer(t);		
	}

	public List<Colleges> afficher() {
	
		return dao.afficher();
	}

	public Colleges getById(int id) {

		return dao.getById(id);
	}

	
	
}
