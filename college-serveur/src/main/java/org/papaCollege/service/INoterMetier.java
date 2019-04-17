package org.papaCollege.service;

import org.papaCollege.entities.Noter;

public interface INoterMetier extends IGestionCollegeMetier<Noter>{
	
	public double getMoyenneParMatiere(int idMatiere);

}
