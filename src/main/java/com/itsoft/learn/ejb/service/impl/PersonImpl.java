package com.itsoft.learn.ejb.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.itsoft.learn.ejb.domain.Person;
import com.itsoft.learn.ejb.service.PersonService;
import com.itsoft.learn.ejb.service.PersonServiceRemote;

@Stateless
public class PersonImpl implements PersonServiceRemote, PersonService {

	public List<Person> getPersonsList() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("Juarez", "Pedro", "pjuarez@gmail.com","864-564-5886"));
		persons.add(new Person("Alicia", "Mendoza", "amendoza@gmail.com","864-564-5886"));
		persons.add(new Person("Rita", "Cruz", "rcruz@gmail.com","864-564-5886"));
		persons.add(new Person("Veronica", "Mars", "vmars@gmail.com","864-564-5886"));
		return persons;
	}

	public void addPerson() {
		// TODO Auto-generated method stub

	}

	public Person findPersonById() {
		// TODO Auto-generated method stub
		return null;
	}

	public void editPerson(Person p) {
		// TODO Auto-generated method stub

	}

	public void deletePerson(Person p) {
		// TODO Auto-generated method stub

	}

	public Person findPersonByEmail(Person p) {
		// TODO Auto-generated method stub
		return null;
	}

}
