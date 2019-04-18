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
		dao.ajouter(t);
		
	}

	public void modifier(Personne t) {
		dao.modifier(t);
		
	}

	public void supprimer(Personne t) {
		dao.supprimer(t);
		
	}

	public List<Personne> afficher() {
		// TODO Auto-generated method stub
		return dao.afficher();
	}

	public Personne getById(int id) {
		return dao.getById(id);
	}

	public FicheSemantique afficherFicheSemantique(int idPersonne) {
		
		Personne p=dao.getById(idPersonne);
		FicheSemantique fs=new FicheSemantique();
		fs.setPrenom(p.getPrenom());
		fs.setMail(p.getMail());
		fs.setTel(p.getTel());
		return fs;
	}

	
	
}
