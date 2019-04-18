package org.papaCollege.controller;

import org.papaCollege.entities.Colleges;
import org.papaCollege.entities.Enseignant;
import org.papaCollege.entities.Matiere;
import org.papaCollege.entities.Salle;
import org.papaCollege.service.IDepartementMetier;
import org.papaCollege.service.IEtudiantMetier;
import org.papaCollege.service.IGestionCollegeMetier;
import org.papaCollege.service.INoterMetier;
import org.papaCollege.service.IPersonneMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class homeController {

//	@Autowired
//	private IDepartementMetier serviceDepartement;
//	@Autowired
//	private IEtudiantMetier serviceEtudiant;
//	@Autowired
//	private INoterMetier serviceNoter;
//	@Autowired
//	private IPersonneMetier servicePersonne;
//	@Autowired
//	private IGestionCollegeMetier<Colleges> serviceCollege;
//	@Autowired
//	private IGestionCollegeMetier<Enseignant> serviceEnseignant;
//	
//	@Autowired
//	private IGestionCollegeMetier<Matiere> serviceMatiere;
//	@Autowired
//	private IGestionCollegeMetier<Salle> serviceSalle;
	
	@RequestMapping(value="/home")
	public String homeAdmin() {
	
	return "Home";
	}


	
}
