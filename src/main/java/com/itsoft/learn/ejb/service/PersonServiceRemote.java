package com.itsoft.learn.ejb.service;

import java.util.List;

import javax.ejb.Remote;

import com.itsoft.learn.ejb.domain.Person;

@Remote
public interface PersonServiceRemote {

	List<Person> getPersonsList();

	void addPerson(Person p);

	Person findPersonById(Long id);

	void editPerson(Person p);

	void deletePerson(Person p);

	Person findPersonByEmail(Person p);

}
