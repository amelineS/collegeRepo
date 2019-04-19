package org.papaCollege.dao;

import java.util.List;

import org.papaCollege.entities.Noter;

public interface INoterDAO {
	
	public void ajouter(Noter t);
	public void modifier(Noter t);
	public void supprimer(Noter t);
	public List<Noter> afficher();
	public Noter getById(int idMatiere, int idEtudiant);
	public double getMoyenneParMatiere(int idMatiere);

}
