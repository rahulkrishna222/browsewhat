package com.browsewhat.app.db.entities;

// Generated Dec 29, 2014 4:56:20 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * BwUser generated by hbm2java
 */
@Entity
@Table(name = "bw_user", catalog = "browsewhat", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class BwUser implements java.io.Serializable {

	private Integer id;
	private String firstName;
	private String lastName;
	private String email;
	private String secondaryEmail;
	private String phone;
	private int URole;
	private char isActive;
	private Set<BwUserAddress> bwUserAddresses = new HashSet<BwUserAddress>(0);
	private Set<BwUserRole> bwUserRoles = new HashSet<BwUserRole>(0);
	private Set<BwLogin> bwLogins = new HashSet<BwLogin>(0);

	public BwUser() {
	}

	public BwUser(String firstName, String lastName, String email,
			String phone, int URole, char isActive) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.URole = URole;
		this.isActive = isActive;
	}

	public BwUser(String firstName, String lastName, String email,
			String secondaryEmail, String phone, int URole, char isActive,
			Set<BwUserAddress> bwUserAddresses, Set<BwUserRole> bwUserRoles,
			Set<BwLogin> bwLogins) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.secondaryEmail = secondaryEmail;
		this.phone = phone;
		this.URole = URole;
		this.isActive = isActive;
		this.bwUserAddresses = bwUserAddresses;
		this.bwUserRoles = bwUserRoles;
		this.bwLogins = bwLogins;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false, length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", nullable = false, length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", unique = true, nullable = false, length = 150)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "secondary_email", length = 150)
	public String getSecondaryEmail() {
		return this.secondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		this.secondaryEmail = secondaryEmail;
	}

	@Column(name = "phone", nullable = false, length = 13)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "u_role", nullable = false)
	public int getURole() {
		return this.URole;
	}

	public void setURole(int URole) {
		this.URole = URole;
	}

	@Column(name = "isActive", nullable = false, length = 1)
	public char getIsActive() {
		return this.isActive;
	}

	public void setIsActive(char isActive) {
		this.isActive = isActive;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bwUser")
	public Set<BwUserAddress> getBwUserAddresses() {
		return this.bwUserAddresses;
	}

	public void setBwUserAddresses(Set<BwUserAddress> bwUserAddresses) {
		this.bwUserAddresses = bwUserAddresses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bwUser")
	public Set<BwUserRole> getBwUserRoles() {
		return this.bwUserRoles;
	}

	public void setBwUserRoles(Set<BwUserRole> bwUserRoles) {
		this.bwUserRoles = bwUserRoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bwUser")
	public Set<BwLogin> getBwLogins() {
		return this.bwLogins;
	}

	public void setBwLogins(Set<BwLogin> bwLogins) {
		this.bwLogins = bwLogins;
	}

}