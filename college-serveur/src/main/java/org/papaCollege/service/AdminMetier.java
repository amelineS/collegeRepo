package org.papaCollege.service;

import java.util.List;

import org.papaCollege.dao.IAdminDAO;
import org.papaCollege.entities.Role;
import org.papaCollege.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Transactional
@Service("serviceAdmin")
public class AdminMetier implements IAdminMetier{

	@Autowired
	private IAdminDAO dao;
	


	public void ajouter(User admin) {
		dao.ajouter(admin);
		
	}

	public void modifier(User admin) {
	dao.modifier(admin);
		
	}

	public void supprimer(User admin) {
		dao.supprimer(admin);
		
	}

	public void ajouter(Role role) {
		dao.ajouter(role);
		
	}

	public List<User> users() {
		return dao.users();
	}
}
