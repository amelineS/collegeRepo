package org.papaCollege.controller;


import java.util.ArrayList;
import java.util.List;

import org.papaCollege.dao.IGestionCollegeCRUD;
import org.papaCollege.entities.Colleges;
import org.papaCollege.entities.Departement;
import org.papaCollege.entities.Enseignant;
import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;
import org.papaCollege.entities.Noter;
import org.papaCollege.service.IDepartementMetier;
import org.papaCollege.service.IEtudiantMetier;
import org.papaCollege.service.IGestionCollegeMetier;
import org.papaCollege.service.INoterMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class controllerNoter {

	@Autowired
	@Qualifier("serviceNoter")
	 INoterMetier serviceNoter;
	@Autowired
	 IEtudiantMetier serviceEtudiant;
	@Autowired
	IGestionCollegeMetier<Matiere> serviceMatiere;
	
	@RequestMapping("/Noter")
	public ModelAndView addNoter() {
		
		ModelAndView view = new ModelAndView("gestionNoter","Noter", new Noter());
		
		List<Noter> Notes = serviceNoter.afficher();
		view.addObject("listeNoter", Notes);
		
		List<Etudiant> etudiants =  serviceEtudiant.afficher();
		view.addObject("etudiants",etudiants);
		
		List<Matiere> matieres = serviceMatiere.afficher();
		view.addObject("listMatieres",matieres);

		return view;
	}

	@RequestMapping("/Noterredirect")
	public ModelAndView AccueilNoter(@ModelAttribute("Noter")Noter n) {
		serviceNoter.ajouter(n);
		
		ModelAndView view = new ModelAndView("gestionNoter","Noter", new Noter());
		
		List<Noter> Notes = serviceNoter.afficher();
		view.addObject("listeNoter", Notes);
		
		List<Etudiant> etudiants =  serviceEtudiant.afficher();
		view.addObject("etudiants",etudiants);
		
		List<Matiere> matieres = serviceMatiere.afficher();
		view.addObject("listMatieres",matieres);
		
		return view;
	}
	

	
	@RequestMapping("/Noteredit")
	public ModelAndView Modifier(@RequestParam int idMatiere, @RequestParam int idEtudiant) {
		
		ModelAndView view = new ModelAndView("gestionNoter","Noter", new Noter());
		
		Noter n = (Noter) serviceNoter.getById(idMatiere, idEtudiant);
		view.addObject("Noter",n);
		
		List<Noter> Notes = serviceNoter.afficher();
		view.addObject("listeNoter", Notes);
		
		List<Etudiant> etudiants =  serviceEtudiant.afficher();
		view.addObject("etudiants",etudiants);
		
		List<Matiere> matieres = serviceMatiere.afficher();
		view.addObject("listMatieres",matieres);
		
		return view;
		
		
	
	}
	
	@RequestMapping("/Noterdelete")
	public ModelAndView Supprimer(@RequestParam int idMatiere, @RequestParam int idEtudiant) {

		ModelAndView view = new ModelAndView("gestionNoter","Noter", new Noter());
		
		Noter n = (Noter) serviceNoter.getById(idMatiere, idEtudiant);
		serviceNoter.supprimer(n);
		
		List<Noter> Notes = serviceNoter.afficher();
		view.addObject("listeNoter", Notes);
		
		List<Etudiant> etudiants =  serviceEtudiant.afficher();
		view.addObject("etudiants",etudiants);
		
		List<Matiere> matieres = serviceMatiere.afficher();
		view.addObject("listMatieres",matieres);
		
		return view;

	}
}
