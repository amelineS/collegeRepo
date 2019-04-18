package org.papaCollege.service;

import java.util.ArrayList;
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
		dao.ajouter(t);
	}

	public void modifier(Etudiant t) {
		// TODO Auto-generated method stub
		dao.modifier(t);
	}

	public void supprimer(Etudiant t) {
		// TODO Auto-generated method stub
		dao.supprimer(t);
	}

	public List<Etudiant> afficher() {
		// TODO Auto-generated method stub
		return dao.afficher();
	}

	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		return dao.getById(id);
	}

	public double getMoyenneGenerale(int idEtudiant) {
		// TODO Auto-generated method stub
		return dao.getMoyenneGenerale(idEtudiant);
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		// TODO Auto-generated method stub
		return dao.getMatieresSansNote(idEtudiant);
	}

	public List<Etudiant> etudiantAdmis() {
		// TODO Auto-generated method stub
		
	List<Etudiant> liste = new ArrayList<Etudiant>();
		List<Etudiant> listetuds = dao.afficher();
		for(Etudiant et : listetuds) {
			if(dao.getMoyenneGenerale(et.getIdPersonne())>=10){
				liste.add(et);
			} 

			return liste;
		}
		
		return null;
	}

	
	
}
