package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.IMatiereDAO;
import org.papaCollege.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceMatiere")
public class MatiereMetier implements IGestionCollegeMetier<Matiere> {

	@Autowired
	private IMatiereDAO dao;
	
	
	
	public MatiereMetier() {
	}

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
