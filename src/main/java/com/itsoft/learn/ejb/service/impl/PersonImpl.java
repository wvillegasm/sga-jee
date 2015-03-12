package com.itsoft.learn.ejb.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.itsoft.learn.eis.PersonDAO;
import com.itsoft.learn.ejb.domain.Person;
import com.itsoft.learn.ejb.service.PersonService;
import com.itsoft.learn.ejb.service.PersonServiceRemote;

@Stateless
public class PersonImpl implements PersonServiceRemote, PersonService {
	
	@EJB
	private PersonDAO personDao;

	public List<Person> getPersonsList() {
		return personDao.findAllPersons();
	}

	public void addPerson(Person p) {
		personDao.insertPerson(p);
	}

	public Person findPersonById(Long id) {
		return personDao.findPersonById(id);
	}

	public void editPerson(Person p) {
		personDao.updatePerson(p);
	}

	public void deletePerson(Person p) {
		personDao.deletePerson(p);
	}

	public Person findPersonByEmail(Person p) {
		return personDao.findPersonByEmail(p);
	}

}
