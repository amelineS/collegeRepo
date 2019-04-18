package org.papaCollege.controller;

import java.util.List;

import org.papaCollege.entities.Colleges;
import org.papaCollege.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class collegeController {

	@Autowired
	IGestionCollegeMetier<Colleges> serviceCollege;
	
	
	
	/* Ajouter un collège */
	
	@RequestMapping("/formcollege")
	public ModelAndView formulaire() {
		
		ModelAndView view = new ModelAndView("gestionCollege", "college", new Colleges());
		List <Colleges> listeColleges = serviceCollege.afficher();
		
		view.addObject("listeC", listeColleges);
		return view;			
	}
	
	@RequestMapping("/addCollege")
	public ModelAndView ajouter(@ModelAttribute("college")Colleges c) {
		
		serviceCollege.ajouter(c);
		
		return new ModelAndView("redirect:/admin/formcollege");
	}
	
	
	
	/* Modifier un collège */
	
	@RequestMapping("/editCollege")
	public ModelAndView modifier(@RequestParam int id) {
		
		ModelAndView view = new ModelAndView("gestionCollege");
		Colleges c = serviceCollege.getById(id);
		List <Colleges> listeColleges = serviceCollege.afficher();
				
		view.addObject("college", c);
		view.addObject("listeC", listeColleges);
		
		return view;
	}
	
	
	
	/* Supprimer un collège */
			
	@RequestMapping("/supprCollege")
	public ModelAndView delete(@RequestParam int id) {
			
		ModelAndView view = new ModelAndView("gestionCollege");
		Colleges c = serviceCollege.getById(id);
		serviceCollege.supprimer(c);
			
		List <Colleges> listeColleges = serviceCollege.afficher();
		view.addObject("college", new Colleges());
		view.addObject("listeC", listeColleges);
			
		return view;
	}
	
	
	
}
