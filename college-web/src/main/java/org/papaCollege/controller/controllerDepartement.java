package org.papaCollege.controller;


import java.util.List;

import org.papaCollege.dao.IGestionCollegeCRUD;
import org.papaCollege.entities.Colleges;
import org.papaCollege.entities.Departement;
import org.papaCollege.entities.Enseignant;
import org.papaCollege.service.IDepartementMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class controllerDepartement {

	@Autowired
	 IDepartementMetier serviceDepartement;
	@Autowired
	 IGestionCollegeCRUD<Colleges> serviceCollege;
	@Autowired
	 IGestionCollegeCRUD<Enseignant> serviceEnseignant;
	
	@RequestMapping("/Departement")
	public ModelAndView addDepartement() {
		
		ModelAndView view = new ModelAndView("gestionDepartement","Departement", new Departement());
		
		List<Departement> Deps = serviceDepartement.afficher();
		view.addObject("listeDepartements", Deps);
		
		List<Enseignant> responsables =  serviceEnseignant.afficher();
		view.addObject("responsables",responsables);
		
		List<Colleges> colleges = serviceCollege.afficher();
		view.addObject("colleges",colleges);
		
		return view;
	}

	@RequestMapping("/Departementredirect")
	public ModelAndView AccueilDepartement(@ModelAttribute("Departement")Departement d) {
		serviceDepartement.ajouter(d);
		

		ModelAndView view = new ModelAndView("gestionDepartement","Departement", new Departement());
		
		List<Colleges> colleges = serviceCollege.afficher();
		view.addObject("colleges",colleges);
		List<Enseignant> responsables = serviceEnseignant.afficher();
		view.addObject("responsables",responsables);
		
		List<Departement> Deps = serviceDepartement.afficher();
		view.addObject("listeDepartements", Deps);
		
		return view;
	}
	

	
	@RequestMapping("/Departementedit")
	public ModelAndView Modifier(@RequestParam int id) {
		
		
		ModelAndView view = new ModelAndView("gestionDepartement");
		
		Departement d = (Departement) serviceDepartement.getById(id);
		List<Departement> Deps = serviceDepartement.afficher();
				
		List<Colleges> colleges = serviceCollege.afficher();
		view.addObject("colleges",colleges);
		List<Enseignant> responsables = serviceEnseignant.afficher();
		view.addObject("responsables",responsables);
		
		view.addObject("Departement",d);
		view.addObject("listeDepartements", Deps);
		return view;
	}
	
	@RequestMapping("/Departementdelete")
	public ModelAndView Supprimer(@RequestParam int id) {
		ModelAndView view = new ModelAndView("gestionDepartement","Departement", new Departement());
		
		Departement d = serviceDepartement.getById(id);
		serviceDepartement.supprimer(d);
		
		List<Colleges> colleges = serviceCollege.afficher();
		view.addObject("colleges",colleges);
		
		List<Enseignant> responsables = serviceEnseignant.afficher();
		view.addObject("responsables",responsables);
		
		List<Departement> Deps = serviceDepartement.afficher();
		view.addObject("listeDepartements", Deps);
		return view;
	}
}
