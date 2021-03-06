package org.papaCollege.controller;

import java.util.List;

import org.papaCollege.entities.Departement;
import org.papaCollege.entities.Enseignant;
import org.papaCollege.entities.Matiere;
import org.papaCollege.service.IDepartementMetier;
import org.papaCollege.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class controllerEnseignant {
	
	//test
	@Autowired
	IGestionCollegeMetier<Enseignant> serviceEnseignant;
	@Autowired
	IDepartementMetier serviceDepartement;
	@Autowired
	IGestionCollegeMetier<Matiere> serviceMatiere;
	
	@RequestMapping("/addEnseignant")
	public ModelAndView ajoutEnseignant() {
		ModelAndView view= new ModelAndView("gestionEnseignant","enseignant", new Enseignant());
		List<Departement> departement = serviceDepartement.afficher();
		List<Enseignant> listeEns = serviceEnseignant.afficher();
		view.addObject("departement",departement);
		view.addObject("listenseignant",listeEns);
		List<Matiere> listeMat = serviceMatiere.afficher();
		view.addObject("listemat", listeMat);
		return  view;
	}
	
	@RequestMapping("/redirectEnseignant")
	public ModelAndView AccueilEns(@ModelAttribute("enseignant")Enseignant ens) {
		serviceEnseignant.ajouter(ens);
		
		
		return new ModelAndView("redirect:/admin/addEnseignant");
	}
	
	@RequestMapping("/modifierEnseignant")
	public ModelAndView modifier(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionEnseignant");
		Enseignant ens =(Enseignant) serviceEnseignant.getById(id);
		List<Departement> departement = serviceDepartement.afficher();
		List<Enseignant> listeEns = serviceEnseignant.afficher();
		List<Matiere> listeMat = serviceMatiere.afficher();
		view.addObject("departement",departement);
		view.addObject("listemat", listeMat);
		view.addObject("enseignant",ens);
		view.addObject("listenseignant", listeEns);
		return view;
	}
	
	@RequestMapping("/supprimerEnseignant")
	public ModelAndView supprimer(@RequestParam int id) {
		ModelAndView view= new ModelAndView("gestionEnseignant","enseignant", new Enseignant());
		Enseignant ens =(Enseignant) serviceEnseignant.getById(id);
		serviceEnseignant.supprimer(ens);
		List<Departement> departement = serviceDepartement.afficher();
		List<Enseignant> listeEns = serviceEnseignant.afficher();
		List<Matiere> listeMat = serviceMatiere.afficher();
		view.addObject("listemat", listeMat);
		view.addObject("departement",departement);

		view.addObject("enseignant",ens);
		view.addObject("listenseignant", listeEns);
		return view;
	}
	

}
