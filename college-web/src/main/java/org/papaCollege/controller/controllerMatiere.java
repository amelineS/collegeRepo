package org.papaCollege.controller;


import java.util.List;


import org.papaCollege.entities.Matiere;
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
public class controllerMatiere {

	@Autowired
	IGestionCollegeMetier<Matiere> serviceMatiere;
	
	@Autowired
	IGestionCollegeMetier<Salle> serviceSalle;

	
	@RequestMapping("/formMatiere")
	public ModelAndView formulaireMatiere() {
		ModelAndView view=new ModelAndView("gestionMatiere","matiere",new Matiere());
		List<Salle> salles = serviceSalle.afficher();
		view.addObject("salles",salles);
		List<Matiere> matieres = serviceMatiere.afficher();
		view.addObject("listMatieres",matieres);
		return view;
		
	}
	
	@RequestMapping("/addMatiere")
	public ModelAndView ajoutMatiere (@ModelAttribute("matiere") Matiere mat) {
//		ModelAndView view = new ModelAndView("gestionMatiere");
		serviceMatiere.ajouter(mat);
		
//		List<Salle> salles = serviceSalle.afficher();
//		view.addObject("salles",salles);
//		List<Matiere> matieres = serviceMatiere.afficher();
//		
//		view.addObject("listMatieres",matieres);
		
		return new ModelAndView("redirect:/admin/formMatiere");
	}
	
	@RequestMapping("/modifierMatiere")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionMatiere");
		Matiere mat =(Matiere) serviceMatiere.getById(id);
		List<Matiere> matieres = serviceMatiere.afficher();
		
		List<Salle> salles = serviceSalle.afficher();
		view.addObject("salles",salles);
		
		view.addObject("matiere",mat);
		view.addObject("listMatieres",matieres);
		return view;
	}
	
	
	@RequestMapping("/supprimerMatiere")
	public ModelAndView supprimer(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionMatiere","matiere",new Matiere());
		Matiere mat =(Matiere) serviceMatiere.getById(id);
		serviceMatiere.supprimer(mat);
		
		List<Salle> salles = serviceSalle.afficher();
		view.addObject("salles",salles);
		List<Matiere> matieres = serviceMatiere.afficher();
		view.addObject("listMatieres",matieres);
		
		return view;
	}
	

}
