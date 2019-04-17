package org.papaCollege.service;

import org.papaCollege.dto.FicheSemantique;
import org.papaCollege.entities.Personne;

public interface IPersonneMetier extends IGestionCollegeMetier<Personne> {
	
	public FicheSemantique afficherFicheSemantique(int idPersonne) ;

}
