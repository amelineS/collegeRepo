package org.papaCollege.dao;

import org.papaCollege.entities.Noter;

public interface INoterDAO extends IGestionCollegeCRUD<Noter> {
	
	
	public double getMoyenneParMatiere(int idMatiere);

}
