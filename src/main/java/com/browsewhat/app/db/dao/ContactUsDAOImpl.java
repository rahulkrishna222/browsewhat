/**
 * 
 */
package com.browsewhat.app.db.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.entities.BwContactus;

/**
 * @author krahul
 *
 */
public class ContactUsDAOImpl implements ContactUsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.browsewhat.app.db.dao.template.DAOTemplate#findAll()
	 */
	@Override
	public BwContactus findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.dao.template.DAOTemplate#insert(java.lang.Object)
	 */
	@Override
	public BwContactus insert(BwContactus t) {
		Session session = sessionFactory.openSession();

		session.save(t);

		return t;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.dao.template.DAOTemplate#delete(java.lang.Object)
	 */
	@Override
	public void delete(BwContactus id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.dao.template.DAOTemplate#find(java.lang.Object)
	 */
	@Override
	public BwContactus find(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.dao.template.DAOTemplate#update(java.lang.Object)
	 */
	@Override
	public BwContactus update(BwContactus t) {
		// TODO Auto-generated method stub
		return null;
	}

}
