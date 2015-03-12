package com.itsoft.learn.ejb.service;

import java.util.List;

import com.itsoft.learn.ejb.domain.Person;

public interface PersonService {

	List<Person> getPersonsList();

	void addPerson(Person p);

	Person findPersonById(Long id);

	void editPerson(Person p);

	void deletePerson(Person p);

	Person findPersonByEmail(Person p);	

}
