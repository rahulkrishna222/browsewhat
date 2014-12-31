/**
 * 
 */
package com.browsewhat.app.utils;

/**
 * @author krahul
 *
 */
public class ReferenceIDGenerator {

	private final static String CONTACT_US_REQUEST_TOKEN_START = "BW-CU";
	private final static String CONTACT_US_REQUEST_TOKEN_END = "NI";

	public final static String createContactUsTiket(Integer id) {
		return new StringBuilder(10).append(CONTACT_US_REQUEST_TOKEN_START)
				.append(id).append(CONTACT_US_REQUEST_TOKEN_END).toString();
	}
}
