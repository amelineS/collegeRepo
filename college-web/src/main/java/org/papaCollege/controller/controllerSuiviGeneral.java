package org.papaCollege.controller;


import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.papaCollege.entities.Departement;
import org.papaCollege.entities.Matiere;
import org.papaCollege.service.IDepartementMetier;
import org.papaCollege.service.IGestionCollegeMetier;
import org.papaCollege.service.INoterMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class controllerSuiviGeneral {
	
	@Autowired
	IDepartementMetier serviceDepartement;
	@Autowired
	INoterMetier serviceNote;
	@Autowired
	IGestionCollegeMetier<Matiere> serviceMatiere;
	
	
	
	@RequestMapping("/suivi")
	public ModelAndView afficher() {
	
		ModelAndView view = new ModelAndView("gestionSuiviGeneral","departement", new Departement());
		
		List<Departement> departement = serviceDepartement.afficher();		
		view.addObject("departements",departement);
		
		List<Matiere> matiere = serviceMatiere.afficher();
		view.addObject("matieres",matiere);
		
		
		return view;
	}
	
	@RequestMapping("/suivi/calculDep")
	public ModelAndView calcul(@ModelAttribute("departement")Departement dep) {
		ModelAndView view = new ModelAndView("gestionSuiviGeneral");
		double moyenne=serviceDepartement.getMoyenneParDepartement(dep.getIdDepartement());
		view.addObject("calculmoyenne",moyenne);
		List<Departement> departement = serviceDepartement.afficher();
		view.addObject("departements",departement);
		List<Matiere> matiere = serviceMatiere.afficher();
		view.addObject("matieres",matiere);
		return view;
		
	}
	
	@RequestMapping("/suivi/calculMatiere")
	public ModelAndView calculMatiere(@ModelAttribute("modelMatiere")Matiere mat) {
		ModelAndView view = new ModelAndView("gestionSuiviGeneral");
		double moyenneMatiere=serviceNote.getMoyenneParMatiere(mat.getIdMatiere());
		view.addObject("calculmoyenneMatiere",moyenneMatiere);
		List<Departement> departement = serviceDepartement.afficher();
		view.addObject("departements",departement);
		List<Matiere> listeMatiere = serviceMatiere.afficher();
		view.addObject("matieres",listeMatiere);
		return view;
	}

}
