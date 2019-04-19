package org.papaCollege.service;

import org.papaCollege.dao.INoterDAO;
import org.papaCollege.entities.Noter;

public interface INoterMetier extends INoterDAO{
	
	public double getMoyenneParMatiere(int idMatiere);

}
