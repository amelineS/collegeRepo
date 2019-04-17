package org.papaCollege.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.papaCollege.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoNoter")
public class NoterDAO implements INoterDAO {

	@Autowired
	private SessionFactory sessionFactory;

	

	public void ajouter(Noter t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(t);

	}

	public void modifier(Noter t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);

	}

	public void supprimer(Noter t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);

	}

	public List<Noter> afficher() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("select t from " + Noter.class.getName() + " t").list();
	}

	public Noter getById(int id) {
		// TODO Auto-generated method stub
		return (Noter) 	sessionFactory.getCurrentSession().get(Noter.class, id);
	}
	
	
 	
	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		List<Double> liste = sessionFactory.getCurrentSession().createQuery(
				" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere").setParameter("id", idMatiere).list();
		
		return liste.get(0);
		//Query q=sessionFactory.getCurrentSession().createQuery(" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere").setParameter("id", idMatiere);
		
		//return (double) q.list().get(0);
		
	}
}
