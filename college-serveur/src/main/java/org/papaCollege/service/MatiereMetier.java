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
		dao.ajouter(t);
		
	}

	public void modifier(Matiere t) {
		dao.modifier(t);
		
	}

	public void supprimer(Matiere t) {
		dao.supprimer(t);
		
	}

	public List<Matiere> afficher() {
		return  dao.afficher();
	}

	public Matiere getById(int id) {
		return dao.getById(id);
	}

	
	
}
