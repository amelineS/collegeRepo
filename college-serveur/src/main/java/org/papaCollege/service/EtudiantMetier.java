package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.IEtudiantDAO;
import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service("serviceEtudiant")
public class EtudiantMetier implements IEtudiantMetier {

	@Autowired
	private IEtudiantDAO dao;
	
	
	
	public EtudiantMetier() {

	}

	public void ajouter(Etudiant t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Etudiant t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Etudiant t) {
		// TODO Auto-generated method stub
		
	}

	public List<Etudiant> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getMoyenneGenerale(int idEtudiant) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
