package org.papaCollege.controller;

import java.util.List;

import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;
import org.papaCollege.service.IEtudiantMetier;
import org.papaCollege.service.IGestionCollegeMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class suiviEtudiantController {

	@Autowired
	IEtudiantMetier serviceEtudiant;
	@Autowired
	IGestionCollegeMetier<Etudiant> serviceEtu;
	
	
	
	/* Page générale */
	
	@RequestMapping("/suivietudiant")
	public ModelAndView formulaire() {
		
		ModelAndView view = new ModelAndView("suiviEtudiant", "etudiant", new Etudiant());
		List <Etudiant> listeEtudiants = serviceEtu.afficher();
		view.addObject("listeEtu", listeEtudiants);
		view.addObject("listeEtud", listeEtudiants);
		return view;			
	}

	
	
	/* Calcul moyenne */
	
	@RequestMapping("/calculmoyenne")
	public ModelAndView calculMoyenne(@ModelAttribute("etudiant") Etudiant etu) {

		ModelAndView view = new ModelAndView("suiviEtudiant");
		
		List <Etudiant> listeEtudiants = serviceEtu.afficher();
		view.addObject("listeEtu", listeEtudiants);
		view.addObject("listeEtud", listeEtudiants);
		
		Etudiant e = serviceEtu.getById(etu.getIdPersonne());
		
		int id = e.getIdPersonne();
		String nom = e.getNom();
		String prenom = e.getPrenom();

		double moyenne = serviceEtudiant.getMoyenneGenerale(e.getIdPersonne());

		view.addObject("etudiant", e);
		view.addObject("id", id);	
		view.addObject("nom", nom);	
		view.addObject("prenom", prenom);		
		view.addObject("moy", moyenne);
		
		return view;
	}
	
	
	
	/* Afficher les matières pour lesquelles l'étudiant n'a pas de notes */
	
	@RequestMapping("/manquenotes")
	public ModelAndView manqueNotes(@ModelAttribute("etudiant") Etudiant etu) {
		
		ModelAndView view = new ModelAndView("suiviEtudiant");
		
		List <Etudiant> listeEtudiants = serviceEtu.afficher();
		view.addObject("listeEtu", listeEtudiants);
		view.addObject("listeEtud", listeEtudiants);
		
		Etudiant e = serviceEtu.getById(etu.getIdPersonne());

		List <Matiere> matieres = serviceEtudiant.getMatieresSansNote(e.getIdPersonne());
		view.addObject("etudiant", e);
		view.addObject("matNotes", matieres);
		
		return view;
	}
	
	
	
	/* Afficher la liste des étudiants admis */
	
	@RequestMapping("/listeadmis")
	public ModelAndView listeAdmis() {
		
		ModelAndView view = new ModelAndView("suiviEtudiant", "etudiant", new Etudiant());
		
		List <Etudiant> listeEtudiants = serviceEtu.afficher();
		view.addObject("listeEtu", listeEtudiants);
		view.addObject("listeEtud", listeEtudiants);
		
		List <Etudiant> etudiantsAdmis = serviceEtudiant.etudiantAdmis();
		view.addObject("etuAdmis", etudiantsAdmis);
		
		return view;
	}

}