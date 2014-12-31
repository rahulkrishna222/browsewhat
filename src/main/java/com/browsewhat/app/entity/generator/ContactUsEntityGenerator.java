/**
 * 
 */
package com.browsewhat.app.entity.generator;

import com.browsewhat.app.db.entities.BwContactus;
import com.browsewhat.app.models.form.ContactUs;

/**
 * @author krahul
 *
 */
public class ContactUsEntityGenerator implements EntityGenerator<BwContactus> {

	@Override
	public BwContactus convertServiceObjectToEntity(Object obj) {
		ContactUs contactUs = (ContactUs) obj;
		if (contactUs != null) {
			return new BwContactus(contactUs.getEmail(),
					contactUs.getSubject(), contactUs.getQuestions(), 'N');
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object convertEntityToServiceObject(BwContactus obj) {
		if (obj != null) {
			return new ContactUs(obj.getId(), obj.getEmail(), obj.getSubject(), obj.getQuestions());
		}
		return null;
	}

}
