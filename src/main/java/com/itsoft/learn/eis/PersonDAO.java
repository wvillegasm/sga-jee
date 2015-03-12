package com.itsoft.learn.eis;

import java.util.List;

import com.itsoft.learn.ejb.domain.Person;

public interface PersonDAO {

	public List<Person> findAllPersons();

	public Person findPersonById(Long id);

	public Person findPersonByEmail(Person p);

	public void insertPerson(Person p);

	public void updatePerson(Person p);

	public void deletePerson(Person p);

}
