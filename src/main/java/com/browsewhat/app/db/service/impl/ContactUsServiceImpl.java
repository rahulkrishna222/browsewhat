/**
 * 
 */
package com.browsewhat.app.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.browsewhat.app.db.dao.ContactUsDAO;
import com.browsewhat.app.db.entities.BwContactus;
import com.browsewhat.app.db.service.ContactUsService;

/**
 * @author krahul
 *
 */
public class ContactUsServiceImpl implements ContactUsService {

	@Autowired
	private ContactUsDAO contactUsDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.browsewhat.app.db.service.template.DBServiceTemplate#findAll()
	 */
	@Override
	public List<BwContactus> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.service.template.DBServiceTemplate#insert(java.lang
	 * .Object)
	 */
	@Override
	public BwContactus insert(BwContactus t) {
		// TODO Auto-generated method stub
		return contactUsDAO.insert(t);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.service.template.DBServiceTemplate#delete(java.
	 * lang.Object)
	 */
	@Override
	public void delete(BwContactus id) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.browsewhat.app.db.service.template.DBServiceTemplate#find(java.lang
	 * .Object)
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
	 * com.browsewhat.app.db.service.template.DBServiceTemplate#update(java.
	 * lang.Object)
	 */
	@Override
	public BwContactus update(BwContactus t) {
		// TODO Auto-generated method stub
		return null;
	}

}
