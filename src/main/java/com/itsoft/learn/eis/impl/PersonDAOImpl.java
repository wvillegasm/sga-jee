package com.itsoft.learn.eis.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.itsoft.learn.eis.PersonDAO;
import com.itsoft.learn.ejb.domain.Person;

@Stateless
public class PersonDAOImpl implements PersonDAO {

	@PersistenceContext(unitName = "SgePULocal")
	private EntityManager em;

	@Override
	public List<Person> findAllPersons() {
		return em.createNamedQuery("Person.findAll").getResultList();
	}

	@Override
	public Person findPersonById(Long id) {
		return em.find(Person.class, id);
	}

	@Override
	public Person findPersonByEmail(Person p) {
		Query q = em.createQuery("FROM Person p WHERE p.email = :email");
		q.setParameter("email", p.getEmail());
		return (Person) q.getSingleResult();
	}

	@Override
	public void insertPerson(Person p) {
		em.persist(p);
	}

	@Override
	public void updatePerson(Person p) {
		em.merge(p);
	}

	@Override
	public void deletePerson(Person p) {
		em.merge(p);
		em.remove(p);
	}

}
