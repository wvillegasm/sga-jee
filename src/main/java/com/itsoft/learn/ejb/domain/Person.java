package com.itsoft.learn.ejb.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persons")
public class Person implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	private Long personId;
	
	@Column(name="last_name", nullable=false, length=25)
	private String lastName;
	
	@Column(nullable=false, length=25)
	private String name;
	
	@Column(nullable=false, length=50)
	private String email;
	
	@Column(length=9)
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
