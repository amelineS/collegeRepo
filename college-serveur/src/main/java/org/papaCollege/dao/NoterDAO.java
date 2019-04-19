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
		if (t.getMatiere() != null && t.getEtudiant() != null) {
			boolean test = true;
			List<Noter> liste = afficher();
			for (Noter n : liste) {
				if (t.getMatiere().getIdMatiere() == n.getMatiere().getIdMatiere()
						&& t.getEtudiant().getIdPersonne() == n.getEtudiant().getIdPersonne()) {
					modifier(t);
					test = false;
				}
			}
			if (test) {
				sessionFactory.getCurrentSession().persist(t);
			}
		}

	}

	public void modifier(Noter t) {
		// TODO Auto-generated method stub
		if (t.getMatiere() != null && t.getEtudiant() != null) {
			List<Noter> liste = afficher();
			for (Noter n : liste) {
				if (t.getMatiere().getIdMatiere() == n.getMatiere().getIdMatiere()
						&& t.getEtudiant().getIdPersonne() == n.getEtudiant().getIdPersonne()) {
					sessionFactory.getCurrentSession().delete(n);
					sessionFactory.getCurrentSession().persist(t);
				}
			}
		}

		

	}

	public void supprimer(Noter t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);

	}

	public List<Noter> afficher() {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().createQuery("select t from " + Noter.class.getName() + " t").list();
	}

	public Noter getById(int idMatiere, int idEtudiant) {
		// TODO Auto-generated method stub
		List<Noter> liste = sessionFactory.getCurrentSession()
				.createQuery("select t from " + Noter.class.getName() + " t").list();
		Noter t = null;
		for (Noter n : liste) {
			if (n.getEtudiant().getIdPersonne() == idEtudiant && n.getMatiere().getIdMatiere() == idMatiere) {
				t = n;
			}
		}
		return t;
	}

	public double getMoyenneParMatiere(int idMatiere) {
		// TODO Auto-generated method stub
		List<Double> liste = sessionFactory.getCurrentSession()
				.createQuery(
						" select avg(note) from Noter n where n.matiere.idMatiere =:id group by n.matiere.idMatiere")
				.setParameter("id", idMatiere).list();

		return liste.get(0);
		// Query q=sessionFactory.getCurrentSession().createQuery(" select avg(note)
		// from Noter n where n.matiere.idMatiere =:id group by
		// n.matiere.idMatiere").setParameter("id", idMatiere);

		// return (double) q.list().get(0);

	}
}
