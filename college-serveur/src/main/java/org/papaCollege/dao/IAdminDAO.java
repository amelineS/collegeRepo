package org.papaCollege.dao;


import java.util.List;

import org.papaCollege.entities.Role;
import org.papaCollege.entities.User;



public interface IAdminDAO {
	
	public void ajouter(User admin);
	public void modifier(User admin);
	public void supprimer(User admin);
	public List<User> users();
	public void ajouter(Role role);

}
