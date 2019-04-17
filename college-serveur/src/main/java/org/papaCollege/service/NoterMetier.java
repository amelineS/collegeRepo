package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.INoterDAO;
import org.papaCollege.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceNoter")
public class NoterMetier implements INoterMetier {

	@Autowired
	private INoterDAO dao;
	
	
	
	public NoterMetier() {

	}

	public void ajouter(Noter t) {
		// TODO Auto-generated method stub
		
	}

	public void modifier(Noter t) {
		// TODO Auto-generated method stub
		
	}

	public void supprimer(Noter t) {
		// TODO Auto-generated method stub
		
	}

	public List<Noter> afficher() {
		// TODO Auto-generated method stub
		return null;
	}

	public Noter getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		return 0;
	}


}
