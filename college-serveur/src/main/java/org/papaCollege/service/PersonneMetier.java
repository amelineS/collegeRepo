package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.IPersonneDAO;
import org.papaCollege.dto.FicheSemantique;
import org.papaCollege.entities.Personne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("servicePersonne")
public class PersonneMetier implements IPersonneMetier {

	@Autowired
	private IPersonneDAO dao;
	
	
	public PersonneMetier() {

	}

	public void ajouter(Personne t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Personne t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Personne t) {
		// TODO Auto-generated method stub
		
	}

	public List<Personne> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Personne getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public FicheSemantique afficherFicheSemantique(int idPersonne) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
