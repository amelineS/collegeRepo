package org.papaCollege.controller;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.papaCollege.entities.Role;
import org.papaCollege.entities.User;
import org.papaCollege.service.IAdminMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller

public class controllerAdmin {
	
	@Autowired
	private IAdminMetier serviceAdmin;
	
//	@RequestMapping(value = "/admin/home", method = RequestMethod.GET)
//	public String homeAdmin( ) {
//		return "Home";
//	}
	
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public String AdminLogin() {
//		return "authentif";
//	}
	
	@RequestMapping("/formAdmin")
	public ModelAndView formulaire() {
		
		return new ModelAndView("addUser","admin",new User());
		
	}
	
	@RequestMapping("/addAdmin")
	public ModelAndView ajout(@ModelAttribute("admin")User admin) {
//		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);
//		System.out.println(admin.getPassword());
//		admin.setPassword(encoder.encode(admin.getPassword()));
		
		serviceAdmin.ajouter(admin);
		return new ModelAndView("redirect:/formAdmin");
		
	}
	
	//Gestion Role
	
	@RequestMapping("/formRole")
	public ModelAndView role() {
		ModelAndView view=new ModelAndView("addRole","role",new Role());
		List<User> users=serviceAdmin.users();
		view.addObject("users",users);
		return view;
		
	}
	
	@RequestMapping("/addRole")
	public ModelAndView ajout(@ModelAttribute("role")Role role) {
		
		
		serviceAdmin.ajouter(role);
		return new ModelAndView("redirect:/formRole");
		
	}


}
