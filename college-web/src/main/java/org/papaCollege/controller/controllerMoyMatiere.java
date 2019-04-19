package org.papaCollege.controller;

import java.util.List;


import org.papaCollege.entities.Matiere;
import org.papaCollege.service.IGestionCollegeMetier;
import org.papaCollege.service.INoterMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/user")
public class controllerMoyMatiere {
	

	@Autowired
	INoterMetier serviceNote;
	@Autowired
	IGestionCollegeMetier<Matiere> serviceMatiere;
	
	
	
	@RequestMapping("/suiviMat")
	public ModelAndView afficher() {
	
		ModelAndView view = new ModelAndView("gestionSuiviMatiere","matiere", new Matiere());
		
		List<Matiere> matiere= serviceMatiere.afficher();	
		view.addObject("matieres",matiere);
		return view;
	}
	
	@RequestMapping("/suiviMat/calculMatiere")
	public ModelAndView calcul(@ModelAttribute("matiere")Matiere mat) {
		ModelAndView view = new ModelAndView("gestionSuiviMatiere");
		double moyenne= serviceNote.getMoyenneParMatiere(mat.getIdMatiere());
		view.addObject("calculmoyenneMatiere",moyenne);
		List<Matiere> matiere = serviceMatiere.afficher();
		view.addObject("matieres",matiere);
	
		return view;
		
	}
	

}
