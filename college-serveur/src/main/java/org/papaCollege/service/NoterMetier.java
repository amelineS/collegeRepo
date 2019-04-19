package org.papaCollege.service;

import java.util.ArrayList;
import java.util.List;

import org.papaCollege.dao.INoterDAO;
import org.papaCollege.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceNoter")
public class NoterMetier implements INoterMetier {

	@Autowired
	@Qualifier("daoNoter")
	private INoterDAO dao;
	
	
	
	public NoterMetier() {

	}

	public void ajouter(Noter t) {
		// TODO Auto-generated method stub
		dao.ajouter(t);
	}

	public void modifier(Noter t) {
		// TODO Auto-generated method stub
		dao.modifier(t);
	}

	public void supprimer(Noter t) {
		// TODO Auto-generated method stub
		dao.supprimer(t);
	}

	public List<Noter> afficher() {
		// TODO Auto-generated method stub
		return dao.afficher();
	}

	public Noter getById(int idMatiere, int idEtudiant) {
		// TODO Auto-generated method stub
		return dao.getById(idMatiere, idEtudiant);
	}

	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		return dao.getMoyenneParMatiere(idMatiere);
	}


}
