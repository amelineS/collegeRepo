package org.papaCollege.service;

import org.papaCollege.entities.Departement;

public interface IDepartementMetier extends IGestionCollegeMetier<Departement>{
	
	public double getMoyenneParDepartement(int idDepartement);

}
