package com.itsoft.learn.ejb.domain;

import java.io.Serializable;

public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long personId;
	private String lastName;
	private String name;
	private String email;
	private String phone;

	public Person() {
		super();
	}

	public Person(String lastName, String name, String email, String phone) {
		super();
		this.lastName = lastName;
		this.name = name;
		this.email = email;
		this.phone = phone;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", lastName=" + lastName
				+ ", name=" + name + ", email=" + email + ", phone=" + phone
				+ "]";
	}

}
