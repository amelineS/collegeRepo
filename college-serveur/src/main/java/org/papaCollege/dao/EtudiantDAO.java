package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoEtudiant")
public class EtudiantDAO implements IEtudiantDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	public double getMoyenneGenerale(int idEtudiant) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		// TODO Auto-generated method stub
		return null;
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

}
