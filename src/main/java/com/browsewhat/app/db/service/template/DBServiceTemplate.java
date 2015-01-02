/**
 * 
 */
package com.browsewhat.app.db.service.template;

import java.util.List;

/**
 * @author krahul
 *
 */
public interface DBServiceTemplate<T> {
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
