package org.papaCollege.controller;

import java.util.List;


import org.papaCollege.entities.Salle;
import org.papaCollege.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class controllerSalle {
	
	@Autowired
	IGestionCollegeMetier<Salle> serviceSalle;
	
	
	@RequestMapping("/formSalle")
	public ModelAndView formulaireSalle() {
		ModelAndView view = new ModelAndView("gestionSalle","salle", new Salle());
		
		List<Salle> salles = serviceSalle.afficher();
		view.addObject("listSalles",salles);

		return view;
	}
	
	@RequestMapping("/addSalle")
	public ModelAndView ajoutMatiere (@ModelAttribute("salle") Salle salle) {
//		ModelAndView view = new ModelAndView("gestionSalle","salle", new Salle());
		serviceSalle.ajouter(salle);
		
//		List<Salle> salles = serviceSalle.afficher();
//		view.addObject("listSalles",salles);

		return new ModelAndView("redirect:/admin/formSalle");
	}
	
	@RequestMapping("/modifierSalle")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionSalle");
		Salle salle =(Salle) serviceSalle.getById(id);

		List<Salle> salles = serviceSalle.afficher();
		
		view.addObject("salle",salle);
		view.addObject("listSalles",salles);


		return view;
	}
	
	
	@RequestMapping("/supprimerSalle")
	public ModelAndView supprimer(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionSalle","salle", new Salle());
		Salle salle =(Salle) serviceSalle.getById(id);
		serviceSalle.supprimer(salle);
		
		List<Salle> salles = serviceSalle.afficher();
		view.addObject("listSalles",salles);
		
		return view;
	}

}
