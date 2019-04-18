package org.papaCollege.controller;

import java.util.List;

import org.papaCollege.entities.Etudiant;
import org.papaCollege.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class controllerEtudiant {
	
	@Autowired
	IGestionCollegeMetier<Etudiant> serviceEtudiant;
	
	@RequestMapping("/formEtudiant")
	public ModelAndView formulaire () {
		ModelAndView view = new ModelAndView("gestionEtudiant","etudiant", new Etudiant());
		
		List<Etudiant> etudiants = serviceEtudiant.afficher();
		view.addObject("listEtudiants",etudiants);		
		return view;
	}
	
	@RequestMapping("/addEtudiant")
	public ModelAndView ajoutEtudiant (@ModelAttribute("etudiant") Etudiant etud) {
//		ModelAndView view = new ModelAndView("gestionEtudiant","etudiant", new Etudiant());
		serviceEtudiant.ajouter(etud);
		
//		List<Etudiant> etudiants = serviceEtudiant.afficher();
//		view.addObject("listEtudiants",etudiants);		
		return new ModelAndView ("redirect:/admin/formEtudiant");
	}
	
	@RequestMapping("/modifierEtudiant")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionEtudiant");
		Etudiant etud =(Etudiant) serviceEtudiant.getById(id);
		List<Etudiant> etudiants = serviceEtudiant.afficher();
		
		
		view.addObject("etudiant",etud);
		view.addObject("listEtudiants",etudiants);
		return view;
	}
	
	
	@RequestMapping("/supprimerEtudiant")
	public ModelAndView supprimer(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionEtudiant","etudiant", new Etudiant());
		Etudiant etud =(Etudiant) serviceEtudiant.getById(id);
		serviceEtudiant.supprimer(etud);
		
 
		List<Etudiant> etudiants = serviceEtudiant.afficher();
		view.addObject("listEtudiants",etudiants);
		
		return view;
	}

}
