package com.itsoft.learn.ejb.service;

import java.util.List;

import javax.ejb.Remote;

import com.itsoft.learn.ejb.domain.Person;

@Remote
public interface PersonService {

	List<Person> getPersonsList();

	void addPerson();

	Person findPersonById();

	void editPerson(Person p);

	void deletePerson(Person p);

	Person findPersonByEmail(Person p);

}
