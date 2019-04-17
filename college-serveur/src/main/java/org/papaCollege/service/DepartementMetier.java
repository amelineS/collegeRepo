package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.IDepartementDAO;
import org.papaCollege.entities.Departement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceDepartement")
public class DepartementMetier implements IDepartementMetier {

	@Autowired
	private IDepartementDAO dao;
	

	
	public DepartementMetier() {

	}

	public void ajouter(Departement t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Departement t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Departement t) {
		// TODO Auto-generated method stub
		
	}

	public List<Departement> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Departement getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getMoyenneParDepartement(int idDepartement) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
