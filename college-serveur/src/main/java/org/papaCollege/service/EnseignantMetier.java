package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.IEnseignantDAO;
import org.papaCollege.entities.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceEnseignant")
public class EnseignantMetier implements IGestionCollegeMetier<Enseignant> {

	
	public EnseignantMetier() {

	}

	@Autowired
	private IEnseignantDAO dao;

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
