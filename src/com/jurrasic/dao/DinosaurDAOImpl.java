package com.jurrasic.dao;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.jurrasic.model.Dinosaur;

@Repository
public class DinosaurDAOImpl implements DinosaurDAO{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public void save(Dinosaur dinosaur) {
		Session session = this.sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.persist(dinosaur);
		tx.commit();
		session.close();
	}

	@Override
	public List<Dinosaur> listDinosaurs() {
		Session session = this.sessionFactory.openSession();
		List<Dinosaur> personList = session.createQuery("from DinosaurLocation").list();
		session.close();
		return personList;
	}

}
