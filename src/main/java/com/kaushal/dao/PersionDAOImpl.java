package com.kaushal.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kaushal.entity.Persion;

@Repository
public class PersionDAOImpl implements PersionDAO {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void savePersion(Persion persion) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(persion);
	}

	@Override
	public List<Persion> fetchPersion() {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return session.createQuery("from Persion").list();
	}

	@Override
	public void updatePersion(Persion persion) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		session.update(persion);
	}

	@Override
	public void removePersion(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		Persion persion = (Persion)session.get(Persion.class, id);
		session.delete(persion);

	}

	@Override
	public Persion getPersionById(int id) {
		// TODO Auto-generated method stub
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(Persion.class, id);
	}

}
