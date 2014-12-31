/**
 * 
 */
package com.browsewhat.app.entity.generator;

/**
 * @author krahul
 *
 */
public interface EntityGenerator<T> {

	public T convertServiceObjectToEntity(Object obj);

	public Object convertEntityToServiceObject(T obj);

}
