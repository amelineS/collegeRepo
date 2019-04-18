package org.papaCollege.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.papaCollege.entities.Enseignant;
import org.papaCollege.entities.Etudiant;
import org.papaCollege.entities.Matiere;
import org.papaCollege.entities.Noter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("daoEtudiant")
public class EtudiantDAO implements IEtudiantDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	public double getMoyenneGenerale(int idEtudiant) {
		// TODO Auto-generated method stub
		Query q= sessionFactory.getCurrentSession().createQuery(" select avg(note) from Noter n where n.etudiant.idPersonne =:id group by n.etudiant.idPersonne").setParameter("id", idEtudiant) ;
		return  (Double) q.list().get(0);
	}

	public List<Matiere> getMatieresSansNote(int idEtudiant) {
		// TODO Auto-generated method stub
		List<Noter> noters=sessionFactory.getCurrentSession().createQuery(" from Noter n").list();
		List<Matiere> matiers=new ArrayList<Matiere>();
		for(Noter n : noters) {
			if(n.getEtudiant().getIdPersonne()==idEtudiant && n.getNote()==null) {
				
				matiers.add(n.getMatiere());
			}	
		}
		
		return matiers;
	}
	
	public void ajouter(Etudiant t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().merge(t);
	}

	public void modifier(Etudiant t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().update(t);
	}

	public void supprimer(Etudiant t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().delete(t);
	}

	public List<Etudiant> afficher() {
		// TODO Auto-generated method stub
		List<Etudiant> liste= sessionFactory.getCurrentSession().createQuery("select t from " + Enseignant.class.getName() +" t").list();
		return liste;
	}

	public Etudiant getById(int id) {
		// TODO Auto-generated method stub
		return (Etudiant) sessionFactory.getCurrentSession().get(Enseignant.class, id);
	}

}
