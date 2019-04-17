package org.papaCollege.service;

import java.util.List;

import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;


public interface IEtudiantMetier extends IGestionCollegeMetier<Etudiant>{
	
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);

}
