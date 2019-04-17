package org.papaCollege.service;

import java.util.ArrayList;
import java.util.List;

import org.papaCollege.dao.IDepartementDAO;
import org.papaCollege.dao.INoterDAO;
import org.papaCollege.entities.Departement;
import org.papaCollege.entities.Enseignant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service("serviceDepartement")
public class DepartementMetier implements IDepartementMetier {

	@Autowired
	private IDepartementDAO daoD;
	@Autowired
	private INoterDAO daoN;

	
	public DepartementMetier() {

	}

	public void ajouter(Departement t) {
		
		daoD.ajouter(t);
	}

	public void modifier(Departement t) {
		
		daoD.modifier(t);
	}

	public void supprimer(Departement t) {
		
		daoD.supprimer(t);
	}

	public List<Departement> afficher() {
		
		return daoD.afficher();
	}

	public Departement getById(int id) {
		
		return daoD.getById(id);
	}

	public double getMoyenneParDepartement(int idDepartement) {

		Departement dep = daoD.getById(idDepartement);		
		
		List <Integer> idMatieres = new ArrayList <Integer> ();
		double sommeMoyenne = 0;
		
		for (Enseignant ens : dep.getEnseignants()) {

			if(ens.getMatiere().getIdMatiere() != 0) {
				
				idMatieres.add(ens.getMatiere().getIdMatiere());
				sommeMoyenne += daoN.getMoyenneParMatiere(ens.getMatiere().getIdMatiere());
			}	
		}
		
		double moyenneDep = sommeMoyenne/idMatieres.size();
		System.out.println("Somme finale "+sommeMoyenne+" Nombre final "+idMatieres.size());
		
		return moyenneDep;
	}
	
}
