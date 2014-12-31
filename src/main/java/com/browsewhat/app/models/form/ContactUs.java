/**
 * 
 */
package com.browsewhat.app.models.form;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

/**
 * @author krahul
 *
 */
public class ContactUs {

	private Integer id;
	@NotNull(message = "Email field cannot be null")
	@Email(message = "Please enter a valid email address")
	private String email;
	private String subject;
	private String questions;

	public ContactUs() {
		// Default constructor
	}

	/**
	 * @param id
	 * @param email
	 * @param subject
	 * @param questions
	 */
	public ContactUs(Integer id, String email, String subject, String questions) {
		this.id = id;
		this.email = email;
		this.subject = subject;
		this.questions = questions;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getQuestions() {
		return questions;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((questions == null) ? 0 : questions.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContactUs other = (ContactUs) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (questions == null) {
			if (other.questions != null)
				return false;
		} else if (!questions.equals(other.questions))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}
}
