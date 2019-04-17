package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.ISalleDAO;
import org.papaCollege.entities.Salle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceSalle")
public class SalleMetier implements IGestionCollegeMetier<Salle> {

	@Autowired
	private ISalleDAO dao;
	
	
	
	public SalleMetier() {

	}

	public void ajouter(Salle t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	public void modifier(Salle t) {
		// TODO Auto-generated method stub
		dao.modifier(t);

	}

	public void supprimer(Salle t) {
		// TODO Auto-generated method stub
		dao.supprimer(t);
	}

	public List<Salle> afficher() {
		// TODO Auto-generated method stub
		return dao.afficher();
	}

	public Salle getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	
	
}
