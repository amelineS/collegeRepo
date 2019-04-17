package org.papaCollege.dao;

import java.util.List;

import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;

public interface IEtudiantDAO  extends IGestionCollegeCRUD<Etudiant>{
	
	public double getMoyenneGenerale(int idEtudiant);
	public List<Matiere> getMatieresSansNote(int idEtudiant);

}
