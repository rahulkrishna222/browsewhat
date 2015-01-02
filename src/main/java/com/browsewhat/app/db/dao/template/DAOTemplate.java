package com.browsewhat.app.db.dao.template;

import java.util.List;

public interface DAOTemplate<T> {
	/**
	 * Returns all entries from DB
	 * 
	 * @return
	 */
	List<T> findAll();

	T insert(T t);

	void delete(T id);

	T find(Object id);

	T update(T t);

}
