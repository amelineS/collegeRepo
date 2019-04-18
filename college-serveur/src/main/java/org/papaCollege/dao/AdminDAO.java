package org.papaCollege.dao;



import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Role;
import org.papaCollege.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository("daoAdmin")
public class AdminDAO implements IAdminDAO {

	
	@Autowired
	SessionFactory sessionFactory;
	
	

	public void ajouter(User admin) {
		sessionFactory.getCurrentSession().persist(admin);
		
	}

	public void modifier(User admin) {
		sessionFactory.getCurrentSession().update(admin);
		
	}

	public void supprimer(User admin) {
		sessionFactory.getCurrentSession().delete(admin);
		
	}

	public List<User> users() {
		
		return sessionFactory.getCurrentSession().createQuery(" from User u").list();
	}
	public void ajouter(Role role) {
		sessionFactory.getCurrentSession().persist(role);
		
	}

}
